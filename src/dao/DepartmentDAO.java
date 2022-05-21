package dao;

import database.DatabaseConnection;
import model.Department;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DepartmentDAO {

    public static boolean insert(Department department) {
        try {
            String sql = "INSERT INTO DEPARTMENT(NAME,DESCRIPTION) values(?,?)";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, department.getName());
            statement.setString(2, department.getDescription());

            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static void update(Department department) {
        try {
            String sql = "UPDATE DEPARTMENT SET NAME=?,DESCRIPTION=? WHERE ID=?";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, department.getName());
            statement.setString(2, department.getDescription());
            statement.setString(3, department.getId());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Department> getDepartments() {
        try {
            String sql = "SELECT * FROM DEPARTMENT";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            ArrayList<Department> list = new ArrayList<>();

            while (result.next()) {
                Department department = new Department();
                department.setId(result.getString("ID"));
                department.setName(result.getString("NAME"));
                department.setDescription(result.getString("DESCRIPTION"));
                list.add(department);
            }

            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
