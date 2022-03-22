package com.example.myapp.model;

import java.io.Serializable;

public class Donut implements Serializable {
    private int id;
    private String name;
    private String title;
    private double price;

    public Donut(int id, String name, String title, double price) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
