package com.company;

public class MyArrayList {
    protected Object[] array;
    protected int size = 0;

    protected int capacity = 10;

    public MyArrayList() {
        this.array = new Object[capacity];
    }

    public MyArrayList(int initialCapacity) {
        this.capacity = initialCapacity;
        this.array = new Object[capacity];
    }

    public void add(Object item){
        if(size == capacity-1){
            capacity *= 2;
            Object[] newArray = new Object[capacity];
            System.arraycopy(array,0, newArray,0, size);
            array = newArray;
        }
        array[size] = item;
        size++;
    }

    public void remove(int index){
        if(index >= 0 && index < size){
            Object[] newArray = new Object[size-1];

            int i = 0;
            for (; i < index; i++) {
                newArray[i] = array[i];
            }
            for (; i < size-1; i++) {
                newArray[i] = array[i+1];
            }

            array = newArray;
            size--;
        }
    }

    public boolean contains(Object item){
        for (int i = 0; i < size; i++) {
            if(array[i] == item)
                return true;
        }
        return false;
    }

    private Object[] getNewArray(int capacity){
        return new Object[capacity];
    }


}
