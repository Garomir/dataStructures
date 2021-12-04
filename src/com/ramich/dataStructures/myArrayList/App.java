package com.ramich.dataStructures.myArrayList;

public class App {
    private static MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();

    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            myArrayList.add(i);
        }

        showElements();
        myArrayList.add(5, 100);
        showElements();
        myArrayList.delete(10);
        showElements();
    }

    private static void showElements(){
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + ",");
        }
        System.out.println();
    }
}
