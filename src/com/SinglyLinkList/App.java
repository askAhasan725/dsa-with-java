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
        return size;
    }

    public boolean isEmpty(){
        if(size==0) return true;
        return false;
    }

    public Node firstNode(){
        return head;
    }

    //Get head & tail
    public int first() throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException("The List is empty!");
        return head.getElement();
    }

    public int last() throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException("The List is empty!");
        return tail.getElement();
    }

    //Add element    
    public void addFirst(int element){
        head = new Node(element, head);
        if(size==0) tail = head;
        size++;
    }

    public void addLast(int element){
        Node tailN = new Node(element, null);
        tail.setNext(tailN);
        if(size==0){
            head = tailN;
            tail = tailN;
        }else{
            tail.setNext(tailN);
            tail=tailN;
        }
        size++;
    }

    public void add(int element, int index){
        Node temp = head;
        for(int i=0; i<=index; i++)
            temp = temp.getNext();
        //add after index:
        Node next = temp.getNext();
        Node newest = new Node(element, next);
        temp.setNext(newest);
    }

    //Remove
    public void removeFirst() throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException("The list is empty!");

        Node temp = head;
        head = temp.getNext();
        size--;
    }

    public void showList() throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException("The list is empty");

        Node temp = head;
        for(int i=0; i<size; i++){
            System.out.print(temp.getElement() + "\t");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public App reverse(App obj){
        App rev = new App();
        Node start = obj.firstNode();
        if(start==null)
            return rev;

        Node current = start;
        for(int i=0; i<size; i++){
            rev.addFirst(current.getElement());
            current = current.getNext();
        }
        return rev;
    }
}
