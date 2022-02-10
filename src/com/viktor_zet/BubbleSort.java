package com.viktor_zet;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        boolean needSorting = true;
        while (needSorting){
            needSorting=false;
            for (int i=1; i<array.length;i++){
                if(array[i-1]>array[i]){
                   int swap=array[i];
                   array[i]=array[i-1];
                   array[i-1]=swap;
                   needSorting=true;
                }
            }
        }
    }


}
