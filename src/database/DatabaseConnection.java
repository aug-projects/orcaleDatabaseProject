package database;
import oracle.jdbc.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/XE";
    private static final String USERNAME = "shop";
    private static final String PASSWROD = "shop";
    private static Connection connection;


    public static Connection getConnection(){
        try {
            DriverManager.registerDriver(new OracleDriver());
            connection = DriverManager.getConnection(URL, USERNAME, PASSWROD);

            return connection;

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        getConnection();
    }
}