package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String s1="cydeo";
        String s2="CYDEO";
        String s3=new String("cydeo");

        System.out.println(s1.equals(s3));              //Tüm karakterlerin aynı olması gerekir.
        System.out.println(s1.equalsIgnoreCase(s2));    //Büyük küçük karaktere bakmadan eşit olup olmadığına bakar.
        System.out.println("-----------------------");
        String sentence = "My favorite programming language is Java";
        boolean c1 =sentence.contains("Java");
        boolean c2 =sentence.contains("java");
        boolean c3 =sentence.toLowerCase().contains("java");
        boolean c4 =sentence.contains("Java")||sentence.contains("java");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println("-------------------");

        String input1 = "I love Java";
        String input2="Java";

        System.out.println(input1.contains(input2));    //input1 in içerisinde input2 var mı? yok mu? ona bakar.
        System.out.println(input1.equalsIgnoreCase(input2));

        System.out.println("---------------------------");

        String input3="Wooden Spoon";
        boolean w1=input3.startsWith("woo");
        boolean w2=input3.endsWith("on");
        System.out.println(w1);
        System.out.println(w2);

    }
}
