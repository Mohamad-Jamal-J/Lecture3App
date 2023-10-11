package com.example.lecture3;
public class Laptop {
    private String brand;
    private String model;
    private double price;
    private int RAM;

    // Constructor
    public Laptop(String brand, String model, double price, int RAM) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.RAM = RAM;
    }

    // Getter and Setter methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return brand + ' ' + model + "," + RAM + "GB, $" + price;
    }
}

