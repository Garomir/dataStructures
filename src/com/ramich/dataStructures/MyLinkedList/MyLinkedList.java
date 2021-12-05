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

    public void addByIndex(int index, T item){
        Node node = new Node();
        node.data = item;
        node.next = null;

        if (index == 0){
            addToHead(item);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
    }

    public void remove(int index){
        if (index == 0){
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node temp = null;
            temp = current.next;
            current.next = temp.next;
            temp = null;
        }
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