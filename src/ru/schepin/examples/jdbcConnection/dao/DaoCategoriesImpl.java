package ru.schepin.examples.jdbcConnection.dao;

import ru.schepin.examples.jdbcConnection.DBWorker;
import ru.schepin.examples.jdbcConnection.model.Category;
import ru.schepin.examples.jdbcConnection.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoCategoriesImpl implements DaoCategories {
    private Connection connection;

    public DaoCategoriesImpl() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        DBWorker dbWorker = new DBWorker();
        connection = dbWorker.getConnection();
    }

    public Connection getConnection() {
        return connection;
    }



    @Override
    public void saveCategory(Category category) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(
                            "insert into productcategories (name,date) values(?,?)");
            preparedStatement.setString(1, category.getName());
            preparedStatement.setDate(2, category.getDate());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
