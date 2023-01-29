package day51_Map;

import java.util.*;

public class IteratingTheMap {
    public static void main(String[] args) {
        Map<String , Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",99);
        students.put("Serkan",70);
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


        Map<String, Integer> earlyBirds = new HashMap<>(); // score >= 90
        Map<String, Integer> angryBirds = new HashMap<>(); // score < 90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if(value >= 90){
                earlyBirds.put(key, value);
            }else{
                angryBirds.put(key, value);
            }
        }


        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);


        Set<String> names = students.keySet();
        System.out.println("names = " + names);

        System.out.println("--------------------------------------------------------");

        // Collection<Integer> scores = students.values();
        List<Integer> scores = new ArrayList<>( students.values() );

        System.out.println(scores);


        for (Integer value : students.values()) {
            System.out.println(value);
        }

        System.out.println("--------------------------------------------------------");

        int maxScore= Integer.MIN_VALUE;
        int minScore=Integer.MAX_VALUE;


        for (Integer eachScore : students.values()) {
            if (eachScore>maxScore){
                maxScore=eachScore;
            }
            if (eachScore<minScore){
                minScore=eachScore;
            }
        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);

        System.out.println("--------------------------------------------------------");

        int max = Collections.max(students.values());
        int min = Collections.min(students.values());
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------------------------------");

        // how many students has the score of 95 or greater

        int count = 0;
        /*
        for (Integer eachScore2 : students.values()) {
            if (eachScore2>=95){
                count++;
            }
        }
        
         */
        for (String eachKey : students.keySet()) {
            Integer eachScore = students.get(eachKey);
            if (eachScore>=95){
                count++;
            }
        }
        System.out.println("count = " + count);

        System.out.println("--------------------------------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
           // System.out.println("entry = " + entry);
            System.out.println(entry.getKey()+" : "+entry.getValue());

        }
    }
}
