package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        6. PlaceAnOrder task:
Ask User to enter the prodcut name (multiple words)
Ask the user to enter the price  (double)
Ask the user to enter the quantity (int)
Ask the user to enter their first name (String, single
word)
Print in the following format:
Ex:
Input: "Apples" , 1.5, 5. "Luke"
Output:
Luke, your order for 5 Apples has been places.
Your total is 7.5.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a product name :");
        String productName = input.nextLine();

        System.out.println("Please enter the price");
        double price = input.nextDouble();

        System.out.println("Please enter a quantity:");
        int quantity = input.nextInt();

        System.out.println("Please enter your name:");
        String name = input.next();
        double totalPrice = quantity * price;
        System.out.println(name + ", your order for " + quantity + " " + productName + " has been places.\nYour total is " + totalPrice);
        input.close();

    }
}
