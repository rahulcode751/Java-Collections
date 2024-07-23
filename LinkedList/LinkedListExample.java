package LinkedList;

import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedListExample {
    public static void main(String[] args) {
        System.out.print("#List\n");
        System.out.print("---> ArrayList\n");
        System.out.print("---> Linkedlist\n");
        System.out.print("---> Stack\n");
        System.out.print("---> Vector\n");

        List<String> array1 = new ArrayList<String>();
        array1.add("1");
        array1.add("2");
        array1.add("3");
        array1.add("4");
        array1.add(2, "22");
        System.out.println("Array 1: " + array1);

        List<String> array2 = new ArrayList<String>();
        array2.add("1");
        array2.add("2");
        array2.add("3");
        array2.add("4");
        array2.add(2, "22"); // insert "22 at index 2"
        array2.remove(1); // remove element at index 1
        array2.remove("22"); // remove element equal to "22"
        array2.set(2, "100"); // set value "100" at index 2

        array1.addAll(array2);
        System.out.println("Array1 has element '1' : " + array1.contains("1"));
        System.out.println("Array 2: " + array2);
        System.out.println("Array 1: " + array1);

        array2.clear(); // remove all element in array2

        for (int i = 0; i < array1.size(); i++) {
            System.out.print(array1.get(i) + " ");
        }
        System.out.println();

        for (String elem : array1) {
            System.out.print(elem + " ");
        }
        System.out.println();

        Iterator<String> it = array1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

    }

}
