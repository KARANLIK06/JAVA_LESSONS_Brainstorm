package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(10,8,9,7,6,1,2,5,4,3));
        Collections.sort(list);
        System.out.println(list);                                   //  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("--------------------------------");

        ArrayList<Character> list2= new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));
        System.out.println(list2);                                  //  [A, B, C, D, E]
        Collections.reverse(list2);
        System.out.println(list2);                                  //  [E, D, C, B, A]

        System.out.println("--------------------------------");

        ArrayList<Integer> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        Collections.swap(list3,4,1);
        System.out.println(list3);                                  //   [10, 50, 30, 40, 20, 60, 70]

        System.out.println("--------------------------------");

        ArrayList<Integer> list4= new ArrayList<>();
        list4.addAll(Arrays.asList(70,50,30,40,20,60,10));

        int max = Collections.max(list4);
        int min = Collections.min(list4);

        System.out.println("max = " + max);                         //  max = 70
        System.out.println("min = " + min);                         //  min = 10

        System.out.println("--------------------------------");

        ArrayList<Integer> list5= new ArrayList<>();
        list5.addAll(Arrays.asList(10,10,50,30,40,20,10,10));
        Collections.replaceAll(list5,10,1000);
        System.out.println("list5 = " + list5);                     //  list5 = [1000, 1000, 50, 30, 40, 20, -10, 1000]

        System.out.println("--------------------------------");

        ArrayList<Integer> list6= new ArrayList<>();
        list6.addAll(Arrays.asList(10,10,50,30,40,20,10,10));

        int frequency =Collections.frequency(list6,10);
        System.out.println("frequency = " + frequency);             //  frequency=4

        System.out.println("----------------------------------");


        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#", "Java"));

        int countJava = Collections.frequency(words, "Java");
        int countPython = Collections.frequency(words, "Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);




    }
}
