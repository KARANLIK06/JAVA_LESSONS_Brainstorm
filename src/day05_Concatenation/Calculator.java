package day05_Concatenation;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 50;
        int totalNumber = firstNumber + secondNumber;
        int subtractionNumber = firstNumber - secondNumber;
        int multiplicationNumber = firstNumber * secondNumber;
        System.out.println(firstNumber + "+" + secondNumber + "=" + totalNumber);
        System.out.println(firstNumber + "-" + secondNumber + "=" + subtractionNumber);
        System.out.println(firstNumber + "*" + secondNumber + "=" + multiplicationNumber);
    }
}
