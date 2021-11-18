package com.company;

public class MyStack extends MyArrayList{

    public void pop(){
        if(size > 0){
            array[size-1] = null;
            size--;
        }
    }
}
