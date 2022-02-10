package com.viktor_zet;

public class MergeSort {

    public static void mergeSort(int[] array) {
        if (array.length <= 1) return;
        int middle = array.length / 2;
        int[] left = new int[middle];
        int[] right = new int[array.length - middle];
        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }
        for (int i = middle; i < array.length; i++) {
            right[i - middle] = array[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    private static void merge(int[] targetArray, int[] array1, int[] array2) {
        int arrayMinIndex1 = 0;
        int arrayMinIndex2 = 0;
        int targetArrayMinIndex = 0;
        while (arrayMinIndex1 < array1.length && arrayMinIndex2 < array2.length) {
            if (array1[arrayMinIndex1] <= array2[arrayMinIndex2]) {
                targetArray[targetArrayMinIndex] = array1[arrayMinIndex1];
                arrayMinIndex1++;
            } else {
                targetArray[targetArrayMinIndex] = array2[arrayMinIndex2];
                arrayMinIndex2++;
            }
            targetArrayMinIndex++;
        }
        while (arrayMinIndex1 < array1.length) {
            targetArray[targetArrayMinIndex] = array1[arrayMinIndex1];
            arrayMinIndex1++;
            targetArrayMinIndex++;
        }
        while (arrayMinIndex2 < array2.length) {
            targetArray[targetArrayMinIndex] = array2[arrayMinIndex2];
            arrayMinIndex2++;
            targetArrayMinIndex++;
        }
    }

}
