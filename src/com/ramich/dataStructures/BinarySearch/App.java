package com.ramich.dataStructures.BinarySearch;

import java.util.Arrays;

public class App {
    public static int[] arr = new int[1000];

    public static void main(String[] args) {
        fillArr();
        Arrays.sort(arr);
        int value = binarySearch(400, arr, 0, arr.length-1);
        if (value == -1){
            System.out.println("int not found!");
        } else {
            System.out.println("int is: " + value);
        }
    }

    public static void fillArr(){
        for (int i = 0; i < 1000; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public static int binarySearch(int search, int[] sortedArr, int low, int high){
        int mid = (low + high) / 2;

        if (high < low) { // больше делить нечего
            return -1;
        }

        if (search == sortedArr[mid]){
            return mid;
        } else if (search < sortedArr[mid]){
            return binarySearch(search, sortedArr, low, mid - 1);
        } else {
            return binarySearch(search, sortedArr, mid + 1, high);
        }
    }
}
