package com.qq30Spring;

public class Car {
    private String brand;
    private String corp;
    private double price;
    private String maxSpeed;

    public Car(String brand, String corp, double price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public Car(String brand, String corp, String maxSpeed) {
        this.brand = brand;
        this.corp = corp;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price='" + price + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }
}
