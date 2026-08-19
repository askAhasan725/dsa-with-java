package com.CaircularlyLinkList;

public class App {
    private Node tail;
    private int size;

    public App() {
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Node first(){
        return tail.getNext();
    }

    public int getFirst() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("The List is Empty!");
        }
        return tail.getNext().getElement();
    }

    public int getLast() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("The List is Empty!");
        }
        return tail.getElement();
    }

    public void addFirst(int element) {
        if (isEmpty()) {
            tail = new Node(element, null);
            tail.setNext(tail);
        } else {
            Node newest = new Node(element, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(int element) {
        addFirst(element);
        tail = tail.getNext();
    }

    public void show() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("The List is Empty!");
        }

        Node temp = tail.getNext();
        for (int i=0; i < size; i++) {
            System.out.print(temp.getElement() + "\t");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public int removeFirst() throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException("The list is empty!");

        Node head = tail.getNext();
        if(head==tail){
            tail = null;
        }else{
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }

    public App reverse(App obj){
        App rev = new App();
        Node start = obj.first();
        if(start==null)
            return rev;

        Node current = start;

        for(int i=0; i<size; i++){
            rev.addFirst(current.getElement());
            current = current.getNext();
        }
        return rev;
    }

    public void rotate() {
        if(tail != null)
            tail=tail.getNext();
    }
}