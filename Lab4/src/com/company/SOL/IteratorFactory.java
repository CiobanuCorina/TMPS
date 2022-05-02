package com.company.SOL;

public interface IteratorFactory<T> {
    Iterator getIterator(T t);
}
