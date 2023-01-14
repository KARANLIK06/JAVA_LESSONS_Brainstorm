package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        //assignment: =
        int number = 100;

        System.out.println("number = " + number);   // result 100

        number = 200;

        System.out.println("number = " + number);   // result 200

        String word = "Java Programming";

        System.out.println("word = " + word);       // result  Java Programming

        word = "Wooden Spoon";

        System.out.println("word = " + word);       // result  Wooden Spoon

        System.out.println("-------------------------------------------------");

        //Addition Assignment:

        int x=100;

        System.out.println("x = " + x);

        x+=200;

        System.out.println("x = " + x);

        String str="Wooden";
        str+="Spoon";
        System.out.println("str = " + str);

        double num1 =2.5;
        System.out.println("num1 = " + num1);   //result num1 = 2.5
        num1+=5.2;
        System.out.println("num1 = " + num1);   //result num1 = 7.7

        System.out.println("------------------------------------");

        double num2=1000.50;
        num2+=300;
        System.out.println("num2 = " + num2);

        System.out.println("------------------------------------");

        double salary = 50000.50;
        System.out.println("salary = " + salary);
        salary*=2;
        System.out.println("salary = " + salary);
        System.out.println("------------------------------------");

        double num3=25000.0;
        num3/=2;
        System.out.println("num3 = " + num3);
        System.out.println("------------------------------------");

        double num4=100;
        num4%=3;
        System.out.println("num4 = " + num4);


    }
}
