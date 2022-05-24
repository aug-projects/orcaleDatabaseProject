package dao;

import database.DatabaseConnection;
import models.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAO {

    public static Customer login(String username, String password) {
        try {
            String sql = "SELECT * FROM CUSTOMER WHERE USERNAME=? AND PASSWORD=?";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();
            Customer loginCustomer = new Customer();

            if (result.next()) {
                System.out.println(result.getString("USERNAME"));
                loginCustomer.setId(result.getString("ID"));
                loginCustomer.setName(result.getString("NAME"));
                loginCustomer.setUsername(result.getString("USERNAME"));
                loginCustomer.setAddress(result.getString("ADDRESS"));
            }

            return loginCustomer;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static boolean insert(Customer customer) {
        try {
            String sql = "INSERT INTO CUSTOMER(NAME,USERNAME,PASSWORD,ADDRESS) values(?,?,?,?)";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getUsername());
            statement.setString(3, customer.getPassword());
            statement.setString(4, customer.getAddress());

            return statement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static void update(Customer customer) {
        try {
            String sql = "UPDATE CUSTOMER SET NAME=?,USERNAME=?,ADDRESS=? WHERE ID=?";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getUsername());
            statement.setString(3, customer.getAddress());
            statement.setString(4, customer.getId());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Customer> getCustomers() {
        try {
            String sql = "SELECT * FROM CUSTOMER";
            PreparedStatement statement  = DatabaseConnection.getConnection().prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            ArrayList<Customer> list = new ArrayList<Customer>();

            while (result.next()) {
                Customer customer = new Customer();
                customer.setId(result.getString("ID"));
                customer.setName(result.getString("NAME"));
                customer.setUsername(result.getString("USERNAME"));
                customer.setAddress(result.getString("ADDRESS"));
                list.add(customer);
            }

            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
