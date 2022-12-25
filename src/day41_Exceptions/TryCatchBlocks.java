package day41_Exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("Test1 Started");

        try{
            System.out.println(9/0);
            System.out.println("Try Block");

        }catch (ArithmeticException a){
            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception is was occurred");
        }



        System.out.println("Test1 Completed");
        System.out.println("=================================");


        System.out.println("Test2 Started");

        int[] numbers ={1,2,3,4,5};

        try{

            System.out.println(numbers[200]);
            System.out.println("Try Block");

        }catch (RuntimeException e){  // Parent class( RuntimeException) can also happen
/*
            System.out.println("Catch Block");
            System.out.println("ArrayIndexOutOfBounds Exception is was occurred");

 */
              e.printStackTrace();
            //System.out.println(e.getMessage());
        }


        System.out.println("Test2 Completed");

        System.out.println("=================================");


        System.out.println("Test3 Started");

        try{
            System.out.println("Cydeo".substring(2, 0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Test3 Completed");

        System.out.println("=================================");


        System.out.println("Test4 Started");



    }
}
