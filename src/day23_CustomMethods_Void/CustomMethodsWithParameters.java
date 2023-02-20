package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(5);
        System.out.println("----------");
        ageOfPerson(1988);
    }





    //create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }


    }


    //create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age =2022-birthYear;
        System.out.println("Your age is "+age);

    }
}
