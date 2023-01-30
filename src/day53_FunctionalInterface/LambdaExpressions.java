package day53_FunctionalInterface;

public class LambdaExpressions {
    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> stringReverse= (s) -> {
            String reverse= new StringBuilder(s).reverse().toString();
            return reverse;
        };
        String result = stringReverse.method("Wooden Spoon");
        System.out.println(result);

        // 1. Create a function that takes one integer and returns the cube of the given argument
    }
}
