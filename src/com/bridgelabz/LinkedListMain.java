package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(56);
        Node<Integer> node2 = new Node<>(30);
        Node<Integer> node3 = new Node<>(70);
        node1.setNext(node2);
        node2.setNext(node3);
        System.out.println(node1);
    }
}
