package models;


public class Cart {

    private String id;
    private String productId;
    private int quantity;
    private String customerId;

    public Cart() {
    }

    public Cart(String id, String productId, int quantity, String customerId) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.customerId = customerId;
    }

    public Cart(String productId, int quantity, String customerId) {
        this.productId = productId;
        this.quantity = quantity;
        this.customerId = customerId;
    }

    public Cart(String id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id='" + id + '\'' +
                ", productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}