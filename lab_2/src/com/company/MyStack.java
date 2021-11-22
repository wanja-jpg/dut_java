package com.company;

public class MyStack<T> extends MyArrayList<T>{
    public void pop(){
        if(size > 0){
            array[size-1] = null;
            size--;
        }
    }
}
