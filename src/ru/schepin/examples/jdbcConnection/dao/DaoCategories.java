package ru.schepin.examples.jdbcConnection.dao;

import ru.schepin.examples.jdbcConnection.model.Category;
import ru.schepin.examples.jdbcConnection.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface DaoCategories {
    void saveCategory(Category category);
}
