package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1=+25;
        int num2 =-25;
        System.out.println(num1<0);
        System.out.println(num2<0);

        System.out.println("--------------------------------------");

        int a=4;

        System.out.println(++a);        //önce sayı artışı yapar. sonra artan değeri ekrana yazdırır.

        int b=8;

        System.out.println(b++);        //önce değeri ekrana yazdırır.  sonra sayı artışı yapar.
        System.out.println("b = " + b);
    }
}
