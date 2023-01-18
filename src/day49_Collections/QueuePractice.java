package day49_Collections;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("priorityQueue = " + priorityQueue);     //Maintains the random order

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("arrayDeque = " + arrayDeque);           //Maintain the insertion order

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("linkedList = " + linkedList);           ////Maintain the insertion order

        System.out.println("-------------------------------------------------");

        priorityQueue.poll(); // Deletes index[0]

        System.out.println(priorityQueue);

        arrayDeque.poll();
        System.out.println(arrayDeque);

        linkedList.poll();
        System.out.println(linkedList);


    }
}
