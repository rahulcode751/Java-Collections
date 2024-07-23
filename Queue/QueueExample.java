package Queue;

import java.util.*;
import java.lang.*;
import java.io.*;

public class QueueExample {
    public static void main(String[] args) {
        System.out.print("#List\n");
        System.out.print("---> ArrayList\n");
        System.out.print("---> Linkedlist\n");
        System.out.print("---> Stack\n");
        System.out.print("---> Vector\n");

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());

    }

}
