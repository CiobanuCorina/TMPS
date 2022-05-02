package com.company.SOL;

public class ArrayFactory<T> implements IteratorFactory<Object[]>{
    @Override
    public Iterator getIterator(Object[] objects) {
        return new ArrayIterator(objects);
    }
}
