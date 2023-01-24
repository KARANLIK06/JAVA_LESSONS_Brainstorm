package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your programming language");
        String progLanguage = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();           //NextLine() metod dan önce diğer metodlardan biri kullanılmışsa araya boş bir input.nextLine(); eklememiz gerekiyor.

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("progLanguage = " + progLanguage);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();
    }
}
