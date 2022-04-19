package com.company.Strategy;

public class HeapSort extends Sortable{
    int temp;

    public HeapSort(Integer[] array) {
        super(array);
    }

    @Override
    public void sort(long startTime, long duration) {
        System.out.println("Executing heap sort");
        for (int i = array.length / 2 - 1; i >= 0; i--)
        {
            if((System.currentTimeMillis() - startTime) >= duration) {
                hasSortableFinished = false;
                return;
            }
            heapify(array, array.length, i);
        }

        for (int i = array.length - 1; i > 0; i--)
        {
            if((System.currentTimeMillis() - startTime) >= duration) {
                hasSortableFinished = false;
                return;
            }
            this.temp = array[0];
            array[0] = array[i];
            array[i] = this.temp;
            heapify(array, i, 0);
        }
    }

    void heapify(Integer[] arr, int n, int i)
    {
        int MAX = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[MAX])
        {
            MAX = left;
        }

        if (right < n && arr[right] > arr[MAX])
        {
            MAX = right;
        }

        if (MAX != i)
        {
            temp = arr[i];
            arr[i] = arr[MAX];
            arr[MAX] = temp;
            heapify(arr, n, MAX);
        }
    }
}
