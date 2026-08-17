package com.Stack;

public class StackApp{
    private int maxLength = 0;
    private int top = 0;
    private int size = 0;
    private int[] Stack;

    public StackApp(int lengthOfStack){
        this.maxLength = lengthOfStack;
        Stack = new int[this.maxLength];
    }

    public boolean empty(){
        if(size == 0)
            return true;

        return false;
    }

    public int size(){
        return this.size;
    }

    public boolean push(int element){
        if(size < maxLength){
            Stack[size] = element;
            top = element;
            size++;
            return true;
        }
        return false;
    }

    public int top() {
        return top;
    }

    public int pop() {
        if(size != 0){
            size--;
            int poped = Stack[size];
            if(size==0)
                top = 0;
            else
                top = Stack[size-1];
            return poped;
        }
        return -1;
    }
}