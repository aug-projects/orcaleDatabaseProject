package dao;

import database.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MangerDAO {

    public static boolean login(String username , String password) {
        try {
            String sql = "SELECT ID,USERNAME,NAME FROM MANGER WHERE USERNAME=? AND PASSWORD=?";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);

            statement.setString(1, username);
            statement.setString(2, password);

            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

}
