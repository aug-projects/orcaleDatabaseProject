package models;

public class Order {

    private String id;
    private String customerID;
    private String address;
    private String description;
    private double totalPrice;

    public Order() {
    }

    public Order(String id, String customerID, String address, String description, double totalPrice) {
        this.id = id;
        this.customerID = customerID;
        this.address = address;
        this.description = description;
        this.totalPrice = totalPrice;
    }

    public Order(String customerID, String address, String description, double totalPrice) {
        this.customerID = customerID;
        this.address = address;
        this.description = description;
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getDescription() {
        return description;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getAddress() {
        return address;
    }
}
