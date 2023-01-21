package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int num1=100;
        int num2=200;

      /*  if(num1<num2){
            System.out.println(num1+ " is Min");
        }
        if(num2<num1){
            System.out.println(num2+ " is Min");
        }
        if(num2==num1){
            System.out.println("Numbers are equal");
        }
       */
        boolean num1isMin=num1<num2;
        boolean num2isMin=num2<num1;
        boolean equal=num1==num2;

        if(num1isMin){
            System.out.println(num1+ " is Min");
        }
        if(num2isMin){
            System.out.println(num1+ " is Min");
        }
        if(equal){
            System.out.println(num1+ "Numbers are equal");
        }
    }
}
