package PrimitiveArray;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ArrayExample {
    public static void main(String[] args) {
        int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int index = Arrays.binarySearch(number, 5);
        System.out.println(index);
        Arrays.sort(number);

        for (int e : number) {
            System.out.print(e + " ");
        }
        System.out.println();

        Arrays.fill(number, 12);
        for (int e : number) {
            System.out.print(e + " ");
        }
        System.out.println();

    }

}
