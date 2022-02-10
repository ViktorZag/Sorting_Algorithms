package com.viktor_zet;

import java.lang.reflect.Array;

import static com.viktor_zet.QuickSort.quickSort;
import static com.viktor_zet.MergeSort.mergeSort;
import static com.viktor_zet.BubbleSort.bubbleSort;

public class Main {

    public static void main(String[] args) {

        int[] array = {10, 54, 33, 112, 51,12};
        mergeSort(array);
        int[] array2 = new int[array.length];
        int k=1;
        for (int arg : array
        ) {
            array2[array.length-k]=arg;
            k++;
        }
        for (int arg:array2
             ) {
            System.out.println(arg);

        }

    }


}
