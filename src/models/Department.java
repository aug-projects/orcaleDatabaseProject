package models;

import java.util.ArrayList;

public class Department {

    private String id;
    private String name;
    private String description;
    private ArrayList<Product> listProduct;

    public Department() {}

    public Department(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Department(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Product> getListProduct() {
        return listProduct;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setListProduct(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    @Override
    public String toString() {
        return name;
    }
}
