package com.company.Iterator;

import java.util.ArrayList;

public class ArrayListFactory<T> implements IteratorFactory<ArrayList<Object>>{

    @Override
    public Iterator getIterator(ArrayList<Object> objects) {
        return new ArrayListIterator(objects);
    }
}
