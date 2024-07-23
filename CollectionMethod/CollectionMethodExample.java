package CollectionMethod;

import java.util.*;

import Set.Student;

import java.lang.*;
import java.io.*;

public class CollectionMethodExample {
    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);
        array1.add(5);
        array1.add(6);

        System.out.println("min elem: " + Collections.min(array1));
        System.out.println("max elem: " + Collections.max(array1));
        System.out.println("frequency elem: " + Collections.frequency(array1, 3));

        Collections.sort(array1);
        System.out.println(array1);

        Collections.sort(array1, Comparator.reverseOrder());
        System.out.println(array1);

        List<Student> array2 = new ArrayList<>();
        array2.add(new Student("a", 1));
        array2.add(new Student("b", 2));
        array2.add(new Student("c", 3));
        array2.add(new Student("d", 4));
        array2.add(new Student("e", 5));
        array2.add(new Student("f", 6));

        Collections.sort(array2);

        Collections.sort(array2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        Student s1 = new Student("a", 1);
        Student s2 = new Student("b", 2);
        System.out.println(s2.compareTo(s1));

    }

}
