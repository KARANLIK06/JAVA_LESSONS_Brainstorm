package day38_Inheritance.animalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, String color, char gender, char size, int age) {
        super(name, breed, color, gender, size, age);
    }

    @Override
    public void eat() {
        System.out.println(name+" eats cat food");
    }
}
