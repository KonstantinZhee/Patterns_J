package Patterns.Structural.Adapter;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class MainAdapter {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(Arrays.asList("A", "B", "C", "D"));
        Enumeration enumeration = vector.elements();
        Iterator iterator = new MyIterator(enumeration);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.remove();
    }
}