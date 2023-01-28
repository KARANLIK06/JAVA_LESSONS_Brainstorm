package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        //  student name & score

        Map<String , Integer> students = new HashMap<>();
        students.put("Aygun",85);
        students.put("Maria",95);
        students.put("Ali",96);
        students.put("Alex",75);
        students.put("Ozan",80);
        students.put("Serkan",92);
        students.put("Andriy",95);
        students.put("Ali",78);
        students.put("Ali",100);


        System.out.println(students);
        System.out.println(students.size());

        // Display the score of Alex
        System.out.println(students.get("Alex"));

        students.replace("Ali",95);
        System.out.println(students.get("Ali"));
        students.remove("Alex");
        System.out.println(students);

        boolean b1 = students.containsKey("Ali");
        System.out.println(b1);
        boolean b2 = students.containsKey("Muhtar");
        System.out.println(b2);
        boolean b3 = students.containsValue(95);
        System.out.println(b3);

        System.out.println(students.isEmpty());

        System.out.println("---------------------------------");

        Map<String , Integer> map1 = new HashMap<>();
        Map<String , Integer> map2 = new HashMap<>();
        map1.putAll(students);
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1==map2);
        System.out.println(map1.equals(map2));

        map1.clear();
        map2.clear();

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

    }
}
