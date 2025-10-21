package oop;

public class Car {

    public String make = "Ford";
    public String model = "Mustang";
    public int year = 2025;
    public double price = 10000.99;
    public boolean isRunning = true;

    public Car(String make, String model, int year, double price, boolean isRunning) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isRunning = isRunning;
    }

    public Car(){
        
    }

}
