package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        /*
        PI, radius, diameter, area, perimeter
					Hints: 	PI = 3.14
					        area = radius * radius * PI
							Perimeter = 2 * radius * PI
         */
        double pi = 3.14;
        double radius = 6.5;
        double area = radius * radius * pi;
        double perimeter = 2 * radius * pi;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }
}
