package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Try {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));
        System.out.println(list);
        System.out.println("---------------");
        ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));
        System.out.println(list2);

        System.out.println("-------------------");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>( scores ); // 90 ~ 100
        gradeOfA.removeIf( p ->  !(p==85)  );
        System.out.println(gradeOfA);
    }
}
