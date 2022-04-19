package com.company.Strategy;

public class Context {
    private Sortable sortable;

    public void setSortable(Sortable sortable) {
        this.sortable = sortable;
    }

    public void sort(long startTime, long duration) {
        sortable.sort(startTime, duration);
    }

    public boolean hasSortableFinished() {
        return sortable.hasSortableFinished;
    }

    public Integer[] getArray() {
        return sortable.getArray();
    }
}
