package day43_Abstraction.car;

public class Car {
    private final String brand,model;
    private String color;
    private final int year;
    private double price;

    //==========Constructor=============
    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);
        if (year<0){
            throw new RuntimeException("Invalid Year : "+year);
        }
        this.year = year;
        setPrice(price);
    }

    //==========Getters=============
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    //==========Setters=============
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(double price) {

       if (price<=0){
           throw new RuntimeException("Invalid Price : "+price);
       }
        this.price = price;
    }
}
