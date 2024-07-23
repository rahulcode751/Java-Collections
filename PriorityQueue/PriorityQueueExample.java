package PriorityQueue;

import java.util.*;
import java.lang.*;
import java.io.*;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);
        pq.offer(5);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder()); // max heap
        pq2.offer(1);
        pq2.offer(2);
        pq2.offer(3);
        pq2.offer(4);
        pq2.offer(5);

        System.out.println(pq2);
        System.out.println(pq2.poll());
        System.out.println(pq2);
        System.out.println(pq2.peek());
        System.out.println(pq2);

    }

}
