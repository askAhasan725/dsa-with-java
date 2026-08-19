package com.CaircularlyLinkList;

public class Node{
    int element;
    Node next;

    public Node(int element, Node next){
        this.element = element;
        this.next = next;
    }

    public int getElement() {
        return element;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}