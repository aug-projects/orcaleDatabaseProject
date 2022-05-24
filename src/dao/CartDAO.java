package dao;

import database.DatabaseConnection;
import models.Cart;
import models.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CartDAO {

    public static boolean insert(Cart cart) {
        try {
            String sql = "INSERT INTO CART(PRODUCT_ID,QUANTITY, CUSTOMER_ID) values(?,?,?)";
            PreparedStatement statement = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, cart.getProductId());
            statement.setString(2, String.valueOf(cart.getQuantity()));
            statement.setString(3, cart.getCustomerId());

            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static String getCartCustomerByProduct(String productId, String customerId) {
        try {
            String sql = "SELECT ID FROM CART WHERE PRODUCT_ID=? AND CUSTOMER_ID=?";
            PreparedStatement statement = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, productId);
            statement.setString(2, customerId);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                return result.getString(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void update(Cart cart) {
        try {
            String sql = "UPDATE CART SET QUANTITY=? WHERE ID=?";
            PreparedStatement statement = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, String.valueOf(cart.getQuantity()));
            statement.setString(2, cart.getId());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Product> getCarBytCustomerId(String customerId) {
        try {
            String sql = "SELECT * FROM cart JOIN product ON cart.product_id = product.id where cart.customer_id =?";
            PreparedStatement statement = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, customerId);
            ResultSet result = statement.executeQuery();
            ArrayList<Product> list = new ArrayList<>();

            while (result.next()) {
                Product product = new Product();
                product.setId(result.getString("product_id"));
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

    public static void delete(String productId) {
        try {
            String sql = "DELETE FROM cart WHERE PRODUCT_ID=?";
            PreparedStatement statement = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, productId);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
