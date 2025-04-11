package com.example.demo.datastructures.linkedlist;

public class LinkedList {
    Node head;

    public void insert(Node newNode){
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
}
