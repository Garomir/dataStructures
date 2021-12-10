package com.ramich.dataStructures.MyBinaryTree;

public class App {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        for (int i = 1; i <= 50; i++) {
            binaryTree.insertNode((int) (Math.random() * 100));
        }

        System.out.println(binaryTree.findNodeByValue(33));
    }
}