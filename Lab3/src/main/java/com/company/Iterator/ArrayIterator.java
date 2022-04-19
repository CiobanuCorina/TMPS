package com.company.Iterator;

import javax.naming.SizeLimitExceededException;

public class ArrayIterator extends Iterator{
    private Object[] objects;

    public ArrayIterator(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public Object getNext() throws SizeLimitExceededException {
        if(hasMore()) {
            return objects[currentIndex++];
        }
        throw new SizeLimitExceededException("Index out of bound");
    }

    @Override
    public boolean hasMore() {
        return currentIndex < objects.length;
    }

    @Override
    public Object getCurrent() throws SizeLimitExceededException {
        if(hasMore()) {
            return objects[currentIndex];
        }
        throw new SizeLimitExceededException("Index out of bound");
    }
}
