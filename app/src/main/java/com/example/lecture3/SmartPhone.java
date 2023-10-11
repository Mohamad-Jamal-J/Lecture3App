package com.example.lecture3;

import androidx.annotation.NonNull;

public class SmartPhone {
    private String brand;
    private String model;
    private double price;
    private int storageCapacity;

    // Constructor
    public SmartPhone(String brand, String model, double price, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storageCapacity = storageCapacity;
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

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return brand + ": " + model + ", " + storageCapacity + "GB, $" + price;
    }
}

