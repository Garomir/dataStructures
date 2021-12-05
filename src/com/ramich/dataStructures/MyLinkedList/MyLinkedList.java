package com.ramich.dataStructures.MyLinkedList;

public class MyLinkedList<T> {

    private Node head;

    public void add(T item){
        Node node = new Node();
        node.data = item;
        node.next = null;

        if (head == null){
            head = node;
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void addToHead(T item){
        Node node = new Node();
        node.data = item;
        node.next = head;
        head = node;
    }



    public void display(){
        Node current = head;
        while (current != null){
            System.out.print(" " + current.data);
            current = current.next;
        }
        System.out.println();
    }

    private class Node {
        private T data;
        private Node next;
    }
}