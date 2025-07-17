package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    private static final String dbName = "library";
    private static final String path = "jdbc:mysql://localhost:3306/"+ dbName;
    private static final String username = "root";
    private static final String password = "";

    public static Connection connect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(path,username,password);
        return conn;
    }
}