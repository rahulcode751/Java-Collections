package Set;

import java.util.Objects;

public class Pair<T1, T2> {
    T1 a;
    T2 b;

    public Pair(T1 a, T2 b) {
        this.a = a;
        this.b = b;
    }

    public T1 getKey() {
        return a;
    }

    public T2 getValue() {
        return b;
    }

    @Override
    public String toString() {
        return "Pair {\n" +
                "   " + "a: " + a + " \n" +
                "   " + "b: " + b + " \n" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Pair pair = (Pair) o;
        return a == pair.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

}
