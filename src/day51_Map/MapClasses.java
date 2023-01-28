package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        //    key  , value
        Map<Integer,String > hashMap = new HashMap<>();
        hashMap.put(10,"Arthur");
        hashMap.put(20,"George");
        hashMap.put(3,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(5,"Ahmet");
        hashMap.put(5,"Isabella");
        hashMap.put(5,"Mehmet");
        hashMap.put(6,null);
        hashMap.put(7,null);
        hashMap.put(null,null);
        hashMap.put(null,"Ahmet");
        hashMap.put(null,"Ahmet");


        System.out.println("hashMap = " + hashMap);

        System.out.println("==================================================");

        Map<Integer,String > linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(10,"Arthur");
        linkedHashMap.put(20,"George");
        linkedHashMap.put(3,"Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(5,"Ahmet");
        linkedHashMap.put(5,"Isabella");
        linkedHashMap.put(null,"Hülya");
        linkedHashMap.put(8,null);

        System.out.println("linkedHashMap = " + linkedHashMap);
        System.out.println("==================================================");


        Map<Integer,String > treeMap = new TreeMap<>();

        treeMap.put(10,"Arthur");
        treeMap.put(20,"George");
        treeMap.put(3,"Jack");
        treeMap.put(40,"Emma");
        treeMap.put(5,"Ahmet");
        treeMap.put(5,"Isabella");
        //treeMap.put(null,"Hülya");
        treeMap.put(6,null);

        System.out.println("treeMap = " + treeMap);

        System.out.println("==================================================");


        Map<Integer,String > hashtable = new Hashtable<>();

        hashtable.put(10,"Arthur");
        hashtable.put(20,"George");
        hashtable.put(3,"Jack");
        hashtable.put(40,"Emma");
        hashtable.put(5,"Ahmet");
        hashtable.put(5,"Isabella");
        //hashtable.put(null,"Hülya");
        //hashtable.put(8,null);


        System.out.println("hashtable = " + hashtable);
    }
}
