package com.example.lecture3;
public class Headphone {
        private String brand;
        private String model;
        private double price;
        private String type;

        // Constructor
        public Headphone(String brand, String model, double price, String type) {
            this.brand = brand;
            this.model = model;
            this.price = price;
            this.type = type;
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

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    @Override
    public String toString() {
            return brand+": "+model+", "+type+", $"+price;
    }
}

