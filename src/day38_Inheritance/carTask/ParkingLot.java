package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota= new Toyota("Corolla",2020,20000,"Blue",12000);
        Tesla tesla=new Tesla("Model S",2020,50000,"Black",10);
        BMW bmw = new BMW("5.20D",2022,40000,"White",500);

        toyota.start();
        bmw.start();
        tesla.start();


    }
}
