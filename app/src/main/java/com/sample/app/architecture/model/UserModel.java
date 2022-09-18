package com.sample.app.architecture.model;

public class UserModel {

    String firstname;
    String lastname;
    int price;
    String product;
    int isavailable;
    String location;

    public String getFirstname() {
        return firstname;
    }

    public UserModel setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public UserModel setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public UserModel setPrice(int price) {
        this.price = price;
        return this;
    }

    public int getIsavailable() {
        return isavailable;
    }

    public UserModel setIsavailable(int isavailable) {
        this.isavailable = isavailable;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public UserModel setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getProduct() {
        return product;
    }

    public UserModel(String firstname, String lastname, int price, String product, int isavailable, String location) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.price = price;
        this.product = product;
        this.isavailable = isavailable;
        this.location = location;
    }

    public UserModel setProduct(String product) {
        this.product = product;
        return this;
    }
}
