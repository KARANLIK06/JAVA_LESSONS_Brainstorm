package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',2,"Small","White");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        //dog.hunt();
        //dog.scratch();
        //dog.meow();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarçın","British",'M',3,"Small","Brown");
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.meow();
        cat.scratch();
        //cat.bark();
        //cat.hunt();


        System.out.println(cat);


        Tiger tiger = new Tiger();

        tiger.setInfo("Sher Khan","Bengal",'M',4,"Large","Orange");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.roar();
        tiger.hunt();
        //tiger.bark();
        //tiger.scratch();
        System.out.println(tiger);

    }
}
