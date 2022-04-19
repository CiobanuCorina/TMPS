package com.company.Iterator;

import javax.naming.SizeLimitExceededException;
import java.util.ArrayList;
import java.util.Arrays;

public class TestIterator {
    public static void main(String[] args) throws SizeLimitExceededException {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("first", "second", "third"));
        IteratorFactory<ArrayList<String>> iteratorFactory1 = new ArrayListFactory();
        Iterator iterator1 = iteratorFactory1.getIterator(strings);
        String[] array = {"first", "second", "third"};
        IteratorFactory<String[]> iteratorFactory2 = new ArrayFactory();
        Iterator iterator2 = iteratorFactory2.getIterator(array);
        for(iterator1.getCurrent(); iterator1.hasMore(); iterator1.getNext()) {
            System.out.println(iterator1.getCurrent());
        }
        for(iterator2.getCurrent(); iterator2.hasMore(); iterator2.getNext()) {
            System.out.println(iterator2.getCurrent());
        }
    }
}
