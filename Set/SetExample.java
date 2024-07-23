package Set;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(5);

        System.out.println(set);
        System.out.println(set.contains(1));
        set.remove(3);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear();

        Set<Integer> set1 = new LinkedHashSet<>(); // maintains order
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(5);

        System.out.println(set1);
        System.out.println(set1.contains(1));
        set1.remove(3);
        System.out.println(set1.size());
        System.out.println(set1.isEmpty());
        set1.clear();

        Set<Integer> set2 = new TreeSet<>(); // stores elem in sorted order
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(5);

        System.out.println(set2);
        System.out.println(set2.contains(1));
        set2.remove(3);
        System.out.println(set2.size());
        System.out.println(set2.isEmpty());
        set2.clear();

        Set<Student> set3 = new HashSet<>();
        set3.add(new Student("Rahul1", 1));
        set3.add(new Student("Rahul2", 2));
        set3.add(new Student("Rahul3", 3));
        set3.add(new Student("Rahul4", 4));
        set3.add(new Student("Rahul5", 5));

        Student student1 = new Student("Rahul1", 1);
        Student student2 = new Student("Rahul1", 1);
        System.out.println(student1.equals(student2));

        System.out.println(set3);
        System.out.println(set3.contains(student1));
        System.out.println(set3.size());
        System.out.println(set3.isEmpty());
        set3.clear();

        // pair class
        Pair<Integer, String> pair = new Pair<>(1, "One");
        Integer key = pair.getKey();
        String value = pair.getValue();

    }
}
