package day13_StringClass;

public class StringIntro {
    public static void main(String[] args) {
        String name1 = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";

        System.out.println(name1==name2);   //true
        System.out.println(name2==name3);   //true

        System.out.println("--------------");

        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spoon");

        System.out.println(str1==str2);     //false
        System.out.println(str2==str3);     //false



    }
}
