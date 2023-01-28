package day51_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IteratingTheMap {
    public static void main(String[] args) {
        Map<String , Integer> students = new HashMap<>();
        students.put("Aygun",95);
        students.put("Maria",95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",78);
        students.put("Serkan",89);
        students.put("Andriy",98);
/*
        Set<String > keys = students.keySet();
        for (String eachkey : keys) {
            System.out.println(eachkey+" : "+ students.get(eachkey));
        }

 */
/*
        for (String eachkey : students.keySet()) {
            Integer eachValue= students.get(eachkey);
            if (eachValue<90){
                System.out.println(eachkey);
            }
        }

 */

    }
}
