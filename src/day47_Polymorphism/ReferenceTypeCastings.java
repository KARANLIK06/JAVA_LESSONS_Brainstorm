package day47_Polymorphism;

import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Cube;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCastings {
    public static void main(String[] args) {
        Shape shape1 = new Circle(4);    // upcasting

        Shape shape2 = new Circle(5);
        // WebDriver driver = (WebDriver)new ChromeDriver();

        Animal animal1 = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //  Dog dog=(Dog)animal1;        //  downcasting
        //  dog.bark();

        ((Dog) animal1).bark();

        Shape shape3 = new Square(5);
        System.out.println(((Square) shape3).getSide());

        System.out.println("----------------------------------------");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");
        ((Cat) animal2).meow();

        //  animal2= new Dog("Max", "Husky", 'M', 3, "Small", "White");
        //  ((Dog)animal2).bark();
        System.out.println("-----------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);
        ((Tester) employee).bugReport();
        //  ((Tester)employee).unitTest();
        //  ((Developer)employee).unitTest();

        //  Driver driver =(Driver) employee;
        Person person =(Person) employee;
        //  Teacher teacher=(Teacher) employee;
        System.out.println("---------------------------------------------");

        Shape shape4=new Circle(10);
        System.out.println(shape4.area());
        System.out.println(shape4.perimeter());
        //  ((Cube)shape4).volume();

    }
}
