package com.company;

public class MyQueue extends MyArrayList{

    public void poll(){
        if(size > 0){
            remove(0);
        }
    }
}
