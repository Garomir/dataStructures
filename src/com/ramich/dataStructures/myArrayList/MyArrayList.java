package com.ramich.dataStructures.myArrayList;

//Моя реализация ArrayList
public class MyArrayList<T> {
    private T[] arr;
    private int arrSize = 10;
    private int element = 0;

    public MyArrayList(int capacity) {
        arr = (T[]) new Object[capacity];
    }

    public MyArrayList() {
        arr = (T[]) new Object[arrSize];
    }

    public void add(T item){
        if (isArrayFull()){
            arr = increaseArray();
        }
        arr[element] = item;
        element++;
    }

    public void add(int index, T item){
        if (isArrayFull()){
            arr = increaseArray();
        }
        moveItemsToRight(index);
        arr[index] = item;
        element++;
    }

    public int size(){
        return element;
    }

    public T get(int index){
        return arr[index];
    }

    public void delete(int index){
        arr[index] = null;
        moveItemsToLeft(index);
    }

    private void moveItemsToRight(int index){
        for (int i = element-1; i >= index; i--) {
            arr[i+1] = arr[i];
        }
    }

    private void moveItemsToLeft(int index){
        for (int i = index; i > element; i++) {
            arr[i] = arr[i+1];
        }
    }

    private boolean isArrayFull(){
        if (element == arrSize){
            return true;
        } else {
            return false;
        }
    }

    private T[] increaseArray(){
        arrSize = arrSize * 2;
        T[] newArr = (T[]) new Object[arrSize];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
