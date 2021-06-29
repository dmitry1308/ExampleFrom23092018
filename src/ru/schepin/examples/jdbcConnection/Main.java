package ru.schepin.examples.jdbcConnection;

import ru.schepin.examples.jdbcConnection.dao.DaoProductImpl;
import ru.schepin.examples.jdbcConnection.model.Category;
import ru.schepin.examples.jdbcConnection.model.Product;

import java.sql.Date;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        DaoProductImpl daoProduct = new DaoProductImpl();

        Category category = new Category("cup", new Date(new java.util.Date().getTime()));
        //  daoProduct.saveCategory(category);
//        Product product = daoProduct.getById(23);
//        System.out.println(product);
//
//        List<Product> allProducts = daoProduct.getAllProducts();
//        for (int i = 0; i < allProducts.size(); i++) {
//            System.out.println(allProducts.get(i));
//        }

        Product product = new Product
                ("telephone", 2500, 2, new Date(new java.util.Date().getTime()));
//        daoProduct.saveProduct(product);

        //String categoryOfFork = daoProduct.getCatById("bread");
        //System.out.println(categoryOfFork);

        daoProduct.deleteProduct("telephone");

        daoProduct.getConnection().close();

    }
}
