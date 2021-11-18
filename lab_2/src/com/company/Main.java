package com.company;

public class Main {

    public static void main(String[] args) {
        // MyLinkedList

	    /*MyLinkedList myLinkedList = new MyLinkedList<Integer>();
	    myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.remove(2);
        System.out.println(myLinkedList.contains(1));
        System.out.println(myLinkedList.contains(3));
        System.out.println(myLinkedList.contains("Hello"));*/

        //MyArrayList

        /*MyArrayList myArrayList = new MyArrayList(10);
        myArrayList.add(10);
        System.out.println(myArrayList.contains(10));
        myArrayList.add(11);
        myArrayList.add("String");
        myArrayList.remove(0);
        System.out.println(myArrayList.contains(10));*/

        // SerializationUtil

        /*User user = new User();
        user.nickname = "TheMasterOfComedy209";
        user.password = "1234";

        User user_2 = new User();
        try {
            SerializationUtil.serialize(user,"user.ser");
            user_2 = SerializationUtil.deserialize("user.ser");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(user_2.nickname);
        System.out.println(user_2.password);*/

        // MyStack

        /*MyStack myStack = new MyStack();
        myStack.add(10);
        myStack.add(11);
        myStack.pop();
        System.out.println();*/

        // MyQueue

        MyQueue myQueque = new MyQueue();
        myQueque.add(10);
        myQueque.add(11);
        myQueque.poll();
        System.out.println();

    }
}
