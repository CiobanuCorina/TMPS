package com.company.Iterator;

import javax.naming.SizeLimitExceededException;
import java.util.ArrayList;

public class ArrayListIterator extends Iterator{
    private ArrayList<Object>objects;

    public ArrayListIterator(ArrayList<Object> objects) {
        this.objects = objects;
    }

    @Override
    public Object getNext() throws SizeLimitExceededException {
        if(hasMore()) {
            return objects.get(currentIndex++);
        }
        throw new SizeLimitExceededException("Index out of bound");
    }

    @Override
    public boolean hasMore() {
        return currentIndex < objects.size();
    }

    @Override
    public Object getCurrent() throws SizeLimitExceededException {
        if(hasMore()) {
            return objects.get(currentIndex);
        }
        throw new SizeLimitExceededException("Index out of bound");
    }
}
