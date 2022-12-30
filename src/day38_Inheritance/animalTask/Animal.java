package day38_Inheritance.animalTask;

public class Animal {

        public String name, breed, color;
        public char gender, size;
        public int age;

        public Animal(String name, String breed, String color, char gender, char size, int age) {
            this.name = name;
            this.breed = breed;
            this.color = color;
            this.gender = gender;
            this.size = size;
            this.age = age;
        }

        public void eat() {
            System.out.println(name + " " + breed + " is eating");
        }

        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", breed='" + breed + '\'' +
                    ", color='" + color + '\'' +
                    ", gender=" + gender +
                    ", size=" + size +
                    ", age=" + age +
                    '}';

        }
    }
/*
 Animal Task:
    1. Create a class named Animal:
            Variables:
                name, breed, age, gender, size, color

            Add a constructor to set all the fields

            methods:
                eat()
                toString()

    2. Create the followin sub classes of Animal and override the eat method:
            1. Cat
                    eat(): eats cat food

            2. Dog
                    eat(): eats dog food

            3. Tiger
                    eat(): eats deer

            4. Eagle
                    eat(): eats snake
 */