package ru.schepin.examples.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {
    public final static String URL = "jdbc:mysql://localhost:3306/shop";
    public final static String USERNAME = "root";
    public final static String USERPASSWORD = "root";

    private Connection connection;

    public DBWorker() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, USERPASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
