package com.company.SingleResponsibility;

public class Product {
    private String name;
    private String model;
    private int quantity;
    private double price;
    private double weight;

    public Product(String name, String model, int quantity, double price, double weight) {
        this.name = name;
        this.model = model;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
