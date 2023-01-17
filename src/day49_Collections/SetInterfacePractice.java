package day49_Collections;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(null,null,null));

        System.out.println("list = " + list);           //list = [10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90,null, null, null]
                                                        // duplicates  are allowed

        System.out.println("list.get(5) = " + list.get(5));


        Set<Integer> hashSet =new HashSet<>();
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(null,null,null));

        System.out.println("hashSet = " + hashSet);     //hashSet = [null, 200, 40, 10, 90, 300]
                                                        //duplicates are NOT allowed, order is random

        // hashSet.get(3);  order is random

        Set<Integer> linkedHashSet =new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(null,null,null));
        System.out.println("linkedHashSet = " + linkedHashSet); //linkedHashSet = [10, 200, 300, 40, 90, null]
                                                                // keeps the insertion order

        Set<Integer> treeSet =new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        //treeSet.addAll(Arrays.asList(null,null,null));    // Does not accept null
        System.out.println("treeSet = " + treeSet);         // treeSet = [10, 40, 90, 200, 300]
                                                            // keeps sorted order



    }
}
