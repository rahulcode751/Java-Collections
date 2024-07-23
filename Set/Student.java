package Set;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Student implements Comparable<Student> {
    public String name;
    public Integer id;

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student {\n" +
                "   " + "name: " + name + " \n" +
                "   " + "id: " + id + " \n" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Student that) {
        return this.id.compareTo(that.id);
    }
}
