package Patterns.Structural.Adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class MyIterator implements Iterator {
    private Enumeration enumeration;
    public MyIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }
    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }
    @Override
    public Object next() {
        return enumeration.nextElement();
    }
    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove is not supported in Enumeration");
    }
}