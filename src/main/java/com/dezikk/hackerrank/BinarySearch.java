package com.dezikk.hackerrank;

import java.util.Arrays;

public class BinarySearch {

    public static int indexOf(int[] array, int key) {
        int begin = 0;
        int end = array.length - 1;
        while (begin <= end) {
            int mid = begin + (end - begin) / 2;
            if (key < array[mid]) {
                end = mid - 1;
            } else if (key > array[mid]) {
                begin = mid + 1;
            } else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        Arrays.sort(array);
        System.out.println(indexOf(array, 3));
    }
}