package models;

public class Product {

    private String id;
    private String name;
    private int quantity;
    private String departmentID;
    private String description;
    private double price;

    public Product() {
    }

    public Product(String name, int quantity, String departmentID, String description, double price) {
        this.name = name;
        this.quantity = quantity;
        this.departmentID = departmentID;
        this.description = description;
        this.price = price;
    }

    public Product(String id, String name, int quantity, String departmentID, String description, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.departmentID = departmentID;
        this.description = description;
        this.price = price;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Product clone() throws CloneNotSupportedException {
        Product product = new Product(name,quantity,departmentID, description,price);

        return product;
    }
    @Override
    public String toString() {
        return name;
    }

}
