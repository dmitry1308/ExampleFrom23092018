package ru.schepin.examples.jdbcConnection.dao;

import ru.schepin.examples.jdbcConnection.model.Category;
import ru.schepin.examples.jdbcConnection.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface DaoProducts {
    void saveProduct(Product product) throws SQLException;

    List<Product> getAllProducts();

    Product getById(int id);

    Product getByName();

    String getCatById(String name) throws SQLException;

    void deleteProduct(String name) throws SQLException;



}
