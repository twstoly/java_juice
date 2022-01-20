package com.company;

public class Vehicle {
    private int year;
    private String brand;
    private String model;
    private int kilometers;
    private int price;



    public Vehicle(int year, String brand, String model, int kilometers, int price) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.kilometers = kilometers;
        this.price = price;
    }

    public boolean worthBuying(int maxPrice){
        return (price < maxPrice);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

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

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}










































































