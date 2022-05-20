package model;


import java.util.ArrayList;


public class Customer {

    private String id;
    private String name;
    private String username;
    private String password;
    private String address;
    private ArrayList<Product> cart;
    private ArrayList<Product> myFavourite;


    public Customer(String name, String username, String password, String address) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public ArrayList<Product> getMyFavourite() {
        return myFavourite;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCart(ArrayList<Product> cart) {
        this.cart = cart;
    }

    public void setMyFavourite(ArrayList<Product> myFavourite) {
        this.myFavourite = myFavourite;
    }
}
