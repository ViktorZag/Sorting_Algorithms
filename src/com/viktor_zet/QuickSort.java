package com.viktor_zet;

public class QuickSort {


    public static void quickSort(int[] arr, int begin, int end) {
        int leftIndex = begin; //0
        int rightIndex = end;  //8
        int middle = arr[(leftIndex + rightIndex) / 2]; // 4, 18, 9, 0, (15), 88, 7, 1, 22

        do {
            // ��������� ���� ������ �������, ���� ������� ������, �� �������
            while (arr[leftIndex] < middle) {
                leftIndex++; // ������ 1
            }
            // ��������� ������ ������ �����, ���� ������� ������, �� �������
            while (arr[rightIndex] > middle) {
                rightIndex--; // ������ 7
            }
            // ��������, ���� ������� ����������, �� �������� ��� ���������� ��������� � ����� �� �� �������
            if (leftIndex <= rightIndex) {
                int tmp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = tmp;
                // ������ �������, ��� �������� ��� ���
                leftIndex++;
                rightIndex--;
            }
        } while (leftIndex <= rightIndex);

        // ������� ���������� ��� ����� ������
        if (leftIndex < end) {
            quickSort(arr, leftIndex, end);
        }
        if (begin < rightIndex) {
            quickSort(arr, begin, rightIndex);
        }
    }

}
