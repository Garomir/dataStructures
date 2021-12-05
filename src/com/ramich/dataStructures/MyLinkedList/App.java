package com.ramich.dataStructures.MyLinkedList;

public class App {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.display();

        myLinkedList.addToHead(55);
        myLinkedList.display();
    }
}