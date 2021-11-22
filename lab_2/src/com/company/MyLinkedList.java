package com.company;

public class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    private class Node<T> {
        Node<T> next;
        Node<T> prev;
        T data;

        public Node(Node<T> prev, T data, Node<T> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    public MyLinkedList(){}

    private void linkLast(T data) {
        Node<T> l = last;
        Node<T> newNode = new Node<T>(l, data, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    public void add(T data) {
        linkLast(data);
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException();
        }else if (index == 0) {
            first = first.next;
            first.prev = null;
        }else if(index == size - 1){
            last = last.prev;
            last.next = null;
        }else {
            unlinkRemoved(index);
        }
        size--;
    }

    public boolean contains(Object data){
        for (int i = 0; i < size - 1; i++) {
            if(findNode(i).data == data){
                return true;
            }
        }
        return false;
    }

    private void unlinkRemoved(int index){
        Node<T> delNode = findNode(index);
        Node<T> prevNode = delNode.prev;
        Node<T> nextNode = delNode.next;
        nextNode.prev = delNode.prev;
        prevNode.next = delNode.next;

    }

    private Node<T> findNode(int index) {
        if(index == 0){
            return first;
        }
        if(index == size-1){
            return last;
        }
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException();
        }

        Node<T> node = first;
        for (int i = 0; i != index; i++) {
            node = node.next;
        }
        return node;

    }

}

