package com.company.Strategy;

public class TestStrategy {
    public static void main(String[] args) {
        Integer[] array = {4, 8, 1, 9, 3, 4, 9, 10, 24, 11, 6, 56, 78, 90, 12, 34, 23, 16, 100};
        Context context = new Context();
        context.setSortable(new SelectionSort(array));
        context.sort(System.currentTimeMillis(), 3);
        Integer[] sortedArray = context.getArray();
        for (Integer i:sortedArray) {
            System.out.println(i);
        }
        if(!context.hasSortableFinished()) {
            context.setSortable(new HeapSort(context.getArray()));
            context.sort(System.currentTimeMillis(), Integer.MAX_VALUE);
        }
        sortedArray = context.getArray();
        for (Integer i:sortedArray) {
            System.out.println(i);
        }
    }
}
