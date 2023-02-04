package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // String myGroup[];
        String[] myGroup1 = new String[5];
        System.out.println(Arrays.toString(myGroup1));   // [null, null, null, null, null]

        System.out.println("------------------------------------------------");

        int[] myGroup2 = new int[5];
        System.out.println(Arrays.toString(myGroup2));  //   [0, 0, 0, 0, 0]

        System.out.println("-------------------------------------------------");

        String[] myGroup3 = new String[5];
        myGroup3[0] = "Gunay";
        myGroup3[1] = "Neira";
        myGroup3[2] = "Suat";
        myGroup3[3] = "Hulya";
        myGroup3[4] = "Mikael";
        System.out.println(Arrays.toString(myGroup3));

        System.out.println("--------------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));

        int number = 5;
        if (number < 1 || number > 7) {
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);


    }
}
