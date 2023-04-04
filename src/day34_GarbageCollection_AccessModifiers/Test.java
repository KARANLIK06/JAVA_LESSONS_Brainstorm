package day34_GarbageCollection_AccessModifiers;
import static day34_GarbageCollection_AccessModifiers.Circle.*;
import static utilities.MathUtility.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println("-------------------------------------------- ");

        // find the sum of 10,20
        int r1 = sum(10,20);
        System.out.println(r1);
        int r2 = subtract(100,50);
        System.out.println(r2);
    }
}
