import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

import static java.lang.Class.forName;

public class DatabaseConnection {
    private static final String dbName = "library";
    private static final String path = "jdbc:mysql://localhost:3306/"+dbName;
    private static final String userName = "root";
    private static final String password = "";


    public static Connection connect() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(path, userName, password);
        return conn;
    }

    public static void main(String[] args) {
        try {
            if (DatabaseConnection.connect()!=null){
                System.out.println("Connection Successful");
            }
            else {
                System.out.println("Connection Failed");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
