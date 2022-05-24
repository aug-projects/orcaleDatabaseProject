package dao;

import database.DatabaseConnection;
import models.Log;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LogsDAO {

    public static boolean insert(Log logs) {
        try {
            String sql = "INSERT INTO LOGS(TYPE,ACCTION_ID,DATA) values(?,?,?)";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, logs.getType());
            statement.setString(2, logs.getActionId());
            statement.setString(3, logs.getData());

            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

}
