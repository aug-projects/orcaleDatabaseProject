package database;

import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;


public class Connection {

    private static Connection instance = null;
    private java.sql.Connection connection;

    public static Connection getInstance() {
            return instance == null ?  instance = new Connection() : instance;
    }

    private Connection() {
        connection = createDBConnection();
    }

    private String getFullUri() {
        String driver = "jdbc:oracle:thin:";
        String host = "@//";
        String port = "/XE";
        return driver + host + "localhost" + ":" + "1521" + port;
    }

    private java.sql.Connection createDBConnection() {
        try {
            DriverManager.registerDriver(new OracleDriver());
            String fullUri = getFullUri();
            connection = DriverManager.getConnection(fullUri, "shop", "shop");

            return connection;

        } catch (SQLException exception) {
            System.out.println( exception.getMessage());
        }

        return null;
    }

    public java.sql.Connection getConnection() {
        return connection;
    }

}
