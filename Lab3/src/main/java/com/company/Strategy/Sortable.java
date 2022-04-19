package com.company.Strategy;

public abstract class Sortable {
    protected Integer[] array;
    protected boolean hasSortableFinished = true;

    public Sortable(Integer[] array) {
        this.array = array;
    }

    public abstract void sort(long startTime, long duration);

    public Integer[] getArray() {
        return array;
    }

    public boolean isHasSortableFinished() {
        return hasSortableFinished;
    }
}
