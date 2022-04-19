package com.company.Strategy;

public class SelectionSort extends Sortable{
    private int position;
    private int temp;

    public SelectionSort(Integer[] array) {
        super(array);
    }

    @Override
    public void sort(long startTime, long duration) {
        System.out.println("Executing selection sort");
        for (int i = 0; i < array.length; i++)
        {
            long stop = System.currentTimeMillis();
//            if (i == 5) {
//                stop = startTime + 10;
//            }
            if((stop - startTime) >= duration) {
                hasSortableFinished = false;
                return;
            }
            this.position = i;
            for (int j = i+1; j < array.length; j++)
            {
                if (array[j] < array[this.position])
                {
                    this.position = j;
                }
            }
            this.temp = array[this.position];
            array[this.position] = array[i];
            array[i] = this.temp;
        }
    }
}
