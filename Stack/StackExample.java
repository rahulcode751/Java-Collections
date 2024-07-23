package Stack;

import java.util.*;
import java.lang.*;
import java.io.*;

public class StackExample {
    public static void main(String[] args) {
        System.out.print("#List\n");
        System.out.print("---> ArrayList\n");
        System.out.print("---> Linkedlist\n");
        System.out.print("---> Stack\n");
        System.out.print("---> Vector\n");

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(4);

        System.out.println("Stack top: " + st.peek());
        st.pop();
        System.out.println(st);

    }

}
