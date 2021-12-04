package com.ramich.dataStructures.myArrayList;

public class App {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();

        for (int i = 1; i <= 15; i++) {
            myArrayList.add(i);
        }

        myArrayList.add(5, 100);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + ",");
        }
    }
}
