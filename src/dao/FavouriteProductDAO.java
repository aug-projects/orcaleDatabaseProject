package dao;

import database.DatabaseConnection;
import models.FavouriteProduct;
import models.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FavouriteProductDAO {

    public static boolean insert(FavouriteProduct favouriteProduct) {
        try {
            String sql = "INSERT INTO FAVOURITE_PRODUCT(PRODUCT_ID,CUSTOMER_ID) values(?,?)";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, favouriteProduct.getProductId());
            statement.setString(2, favouriteProduct.getCustomerId());

            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static void delete(String productId) {
        try {
            String sql = "DELETE FROM FAVOURITE_PRODUCT WHERE PRODUCT_ID=?";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, productId);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean getFavouriteByProductId(String productId) {
        try {
            String sql = "SELECT ID FROM FAVOURITE_PRODUCT WHERE PRODUCT_ID=?";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, productId);

            return statement.executeUpdate() > 0 ;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static ArrayList<Product> getFavouritesByProductId(String productId) {
        try {
            String sql = "SELECT * FROM favourite_product JOIN product ON favourite_product.product_id = product.id where favourite_product.CUSTOMER_ID =?";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, productId);
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

}
