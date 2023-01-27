package day15_ForLoop;

public class IsEmptyBlank {
    public static void main(String[] args) {

        String str1 ="";


        boolean r1=str1.isEmpty();
        boolean r2=str1.isBlank();

        System.out.println(r1);         //true
        System.out.println(r2);         //true

        System.out.println("-----------------------");

        String str2="     ";

        boolean r3=str2.isEmpty();
        boolean r4=str2.isBlank();

        System.out.println(r3);     //false
        System.out.println(r4);     //true

        System.out.println("----------------");

        String str3="Cydeo     ";
        boolean r5=str3.isBlank();
        boolean r6=str3.isEmpty();
        System.out.println(r5);     //false
        System.out.println(r6);     //false


    }
}
