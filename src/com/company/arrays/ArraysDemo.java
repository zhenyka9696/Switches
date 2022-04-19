package com.company.arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //найти недостающий элемент массива
        int[] arr =/* new int[]*/{3, 2, 4, 6, 1};

        //System.out.println(Arrays.toString(arr));
       int missing=getMissing(arr);//входящий массив тут
        System.out.println(missing);
    }

    public static int getMissing(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        int missing = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min + i) {
                missing = min + i;
                break;
            }
        }
        return missing;
    }
}
