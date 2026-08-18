package com.SinglyLinkList;

public class Node {
    private int element;
    private Node next;

    public Node(int e, Node n){
        element = e;
        next = n;
    }

    public int getElement(){
        return element;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node n){
        next = n;
    }
}
