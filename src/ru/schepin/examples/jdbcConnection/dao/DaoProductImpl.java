package ru.schepin.examples.jdbcConnection.dao;

import ru.schepin.examples.jdbcConnection.DBWorker;
import ru.schepin.examples.jdbcConnection.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoProductImpl implements DaoProducts {
    private Connection connection;

    public DaoProductImpl() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        DBWorker dbWorker = new DBWorker();
        connection = dbWorker.getConnection();
    }

    public Connection getConnection() {
        return connection;
    }

    @Override
    public void saveProduct(Product product) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into products (name,price,cat_id,date) values(?,?,?,?)");
        preparedStatement.setString(1, product.getName());
        preparedStatement.setInt(2, product.getPrice());
        preparedStatement.setInt(3, product.getProductCategoriesId());
        preparedStatement.setDate(4, product.getDate());
        preparedStatement.execute();
    }

    @Override
    public List<Product> getAllProducts() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from products");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int price = resultSet.getInt(3);
                int productCategoriesId = resultSet.getInt(4);
                Date date = resultSet.getDate(5);
                Product product = new Product(id, name, price, productCategoriesId, date);
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product getById(int id) {
        Product product = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from products where id=" + id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString(2);
                int price = resultSet.getInt(3);
                int productCategoriesId = resultSet.getInt(4);
                Date date = resultSet.getDate(5);
                product = new Product(id, name, price, productCategoriesId, date);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public Product getByName() {
        return null;
    }

    @Override
    public String getCatById(String name) throws SQLException {
        String category = null;

        String query = String.format("select productcategories.name  from products\n" +
                "left join productcategories on products.cat_id=productcategories.id\n" +
                "where products.name='%s';\n", name);
        PreparedStatement statement = connection.prepareStatement(query);

        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            category = resultSet.getString("name");
        }
        statement.close();
        return category;
    }

    @Override
    public void deleteProduct(String name) throws SQLException {
        String query = String.format("delete  from products where name='%s'", name);
        connection.prepareStatement(query).execute();
    }
}
