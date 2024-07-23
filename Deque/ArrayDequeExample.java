package Deque;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        deque.offerLast(4);

        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque);

        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);

    }
}
