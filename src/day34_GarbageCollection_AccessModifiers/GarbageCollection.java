package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
/*
  //   int n = null;      //  primitive data type larda null kullanamayız
        String str1 = null;     //  null is not object, empty String is object.
        System.out.println(str1.toUpperCase());

        String str2 = "";
        System.out.println(str2.toUpperCase());
 */

        String str = "Wooden Spoon";   // after line 13, "Wooden Spoon" will be eligible for garbage collection
        str=null;
        System.out.println(str);

        Car car1= new Car("Toyota");
        car1=null;
        System.out.println(car1);

        System.out.println("------------------------------------");

        Dog dog1 = new Dog();
        dog1.name="Lucy";

        dog1= new Dog();
        dog1.name="Max";
        System.out.println(dog1);

        String language = "Python";
        language="Java";
        System.out.println(language);
        System.out.println("----------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2= list1;
        System.out.println(list2);

        System.out.println("----------------------------");




        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(100);
        ArrayList<Integer> list4= list3;
        list4.addAll(Arrays.asList(200,300,400));
        System.out.println(list4);
        System.out.println(list3);
        System.out.println((list3 == list4));


        System.out.println("-----------------------------------");

        Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

    }
}
