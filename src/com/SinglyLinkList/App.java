package com.SinglyLinkList;

public class App {
    private Node head;
    private Node tail;
    private int size;

    public App() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size(){
        if(size==0) return true;
        return false;
    }

    //Get head & tail
    public int first() thows IllegalArgumentException{
        if(!size())
            throws new IllegalArgumentException('The List is empty!');
        return head.getElement();
    }

    public int last() throw IllegalArgumentException{
        if(!size())
            throws new IllegalArgumentException('The List is empty!');
        return tail.getNext();
    }

    //Add element
    
    
    public void addFirst(Node n){
        n.setNext(head);
        head = n;
    }
}
