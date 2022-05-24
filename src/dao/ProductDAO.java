package dao;

import database.DatabaseConnection;
import models.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {

    public static boolean insert(Product product) {
        try {
            String sql = "INSERT INTO PRODUCT(NAME,QUANTITY, DEPARTMENT_ID,DESCRIPTION, PRICE) values(?,?,?,?,?)";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, product.getName());
            statement.setString(2, String.valueOf(product.getQuantity()));
            statement.setString(3, product.getDepartmentID());
            statement.setString(4, product.getDescription());
            statement.setString(5, String.valueOf(product.getPrice()));

            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static boolean update(Product product) {
        try {
            String sql = "UPDATE PRODUCT SET NAME=?,DESCRIPTION=?,DEPARTMENT_ID=?,PRICE=?,QUANTITY=? WHERE ID=?";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, product.getName());
            statement.setString(2, product.getDescription());
            statement.setString(3, product.getDepartmentID());
            statement.setString(4, String.valueOf(product.getPrice()));
            statement.setString(5, String.valueOf(product.getQuantity()));
            statement.setString(6, product.getId());

            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static void updateQuantity(int quantity,String productID) {
        try {
            String sql = "UPDATE PRODUCT SET QUANTITY=? WHERE ID=?";
            PreparedStatement statement = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, String.valueOf(quantity));
            statement.setString(2, productID);

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Product> getProductsByDepartmentID(String departmentID) {
        try {
            String sql = "SELECT * FROM PRODUCT WHERE department_id=?";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, departmentID);
            ResultSet result = statement.executeQuery();
            ArrayList<Product> list = new ArrayList<>();

            while (result.next()) {
                Product product = new Product();
                product.setId(result.getString("ID"));
                product.setName(result.getString("NAME"));
                product.setDescription(result.getString("DESCRIPTION"));
                product.setDepartmentID(result.getString("DEPARTMENT_ID"));
                product.setPrice(Double.parseDouble(result.getString("PRICE")));
                product.setQuantity(Integer.parseInt(result.getString("QUANTITY")));
                list.add(product);
            }

            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<Product> getProducts() {
        try {
            String sql = "SELECT * FROM PRODUCT";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            ArrayList<Product> list = new ArrayList<>();

            while (result.next()) {
                Product product = new Product();
                product.setId(result.getString("ID"));
                product.setName(result.getString("NAME"));
                product.setDescription(result.getString("DESCRIPTION"));
                product.setDepartmentID(result.getString("DEPARTMENT_ID"));
                product.setPrice(Double.parseDouble(result.getString("PRICE")));
                product.setQuantity(Integer.parseInt(result.getString("QUANTITY")));
                list.add(product);
            }

            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
