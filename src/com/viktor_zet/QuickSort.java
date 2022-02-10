package com.viktor_zet;

public class QuickSort {


    public static void quickSort(int[] arr, int begin, int end) {
        int leftIndex = begin; //0
        int rightIndex = end;  //8
        int middle = arr[(leftIndex + rightIndex) / 2]; // 4, 18, 9, 0, (15), 88, 7, 1, 22

        do {
            // Пересуваєм лівий маркер направо, поки елемент менший, ніж середній
            while (arr[leftIndex] < middle) {
                leftIndex++; // індекс 1
            }
            // Пересуваєм правий маркер наліво, поки елемент менший, ніж середній
            while (arr[rightIndex] > middle) {
                rightIndex--; // індекс 7
            }
            // Перевірим, якщо маркери пересіклися, то елементи вже розташовані правильно і міняти їх не потрібно
            if (leftIndex <= rightIndex) {
                int tmp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = tmp;
                // Зсуваєм маркери, щоб отримати нові межі
                leftIndex++;
                rightIndex--;
            }
        } while (leftIndex <= rightIndex);

        // Виконуєм рекурсивно для інших частин
        if (leftIndex < end) {
            quickSort(arr, leftIndex, end);
        }
        if (begin < rightIndex) {
            quickSort(arr, begin, rightIndex);
        }
    }

}
