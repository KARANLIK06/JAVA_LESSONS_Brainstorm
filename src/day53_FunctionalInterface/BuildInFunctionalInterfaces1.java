package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {
    public static void main(String[] args) {
        Predicate<String> isPalindrome = p ->{
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };
        boolean result1= isPalindrome.test("Civic");
        System.out.println(result1);

       

    }
}
