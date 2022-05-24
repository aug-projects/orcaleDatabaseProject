package models;

public class FavouriteProduct {

    private String id;
    private String productId;
    private String customerId;

    public FavouriteProduct() {
    }

    public FavouriteProduct( String productId, String customerId) {
        this.productId = productId;
        this.customerId = customerId;
    }

    public FavouriteProduct(String id, String productId, String customerId) {
        this.id = id;
        this.productId = productId;
        this.customerId = customerId;
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
}
