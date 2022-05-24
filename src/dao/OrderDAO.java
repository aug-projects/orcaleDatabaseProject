package dao;

import database.DatabaseConnection;
import models.Order;
import models.OrderDetails;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDAO {

    public static boolean insert(Order order) {
        try {
            String sql = "INSERT INTO ORDER(customer_id,address,total_price,description) values(?,?,?,?)";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, order.getCustomerID());
            statement.setString(2, order.getAddress());
            statement.setString(3, String.valueOf(order.getTotalPrice()));
            statement.setString(4, order.getDescription());

            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static boolean insertOrderDetails(OrderDetails orderDetails) {
        try {
            String sql = "INSERT INTO order_detail(order_id,proudct_id,price,quantity) values(?,?,?,?)";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, orderDetails.getOrderID());
            statement.setString(2, orderDetails.getOrderID());
            statement.setString(3, String.valueOf(orderDetails.getPrice()));
            statement.setString(4, String.valueOf(orderDetails.getQuantity()));

            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


}
