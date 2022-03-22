package com.example.myapp.model;


public class Language {
    private int id;
    private String name;
    private String shop;
    private String shopName;

    public Language(int id, String name, String shop, String shopName) {
        this.id = id;
        this.name = name;
        this.shop = shop;
        this.shopName = shopName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShop() {
        return shop;
    }

    public String getShopName() {
        return shopName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}