package day04_Variables;

public class GallonsToLitters {
    /*
     Create a class named GallonsToLitters, Write a program that can convert gallon (int) to litter (double)

					Hints: 1 gallon = 3.79 litters
					                    1000
					                    10000
     */
    public static void main(String[] args) {
        int gallon = 1000;
        double litters = 3.79 * gallon;

        System.out.println("litters = " + litters);
    }
}
