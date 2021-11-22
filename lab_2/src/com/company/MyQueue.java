package com.company;

public class MyQueue<T> extends MyArrayList<T>{

    public void poll(){
        if(size > 0){
            remove(0);
        }
    }
}
