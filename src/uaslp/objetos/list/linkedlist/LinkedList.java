package uaslp.objetos.list.linkedlist;

import src.uaslp.objetos.list.Iterator;
import src.uaslp.objetos.list.List;

public class LinkedList implements List {

    private Node head;
    private Node tail;
    private int size;

    public void addAtTail(String data) {
        Node node = new Node(data);

        if (size == 0) {
            head = node;
        } else {
            tail.Next = node;
            node.previous = tail;
        }
        tail = node;
        size++;

    }

    public void addAtFront(String data) {
        Node node = new Node(data);

        if (size == 0) {
            head = node;
            tail = node;

        } else {

            head.previous = node;
        }
        node.Next = head;
        head = node;
        size++;
    }

    public void remove(int index) {
        Node node = findNode(index);
        if (node == null) {
            return;
        }
        if(size == 1){
            head = null;
            tail = null;
        }else if (node == head) {
            head = node.Next;
            if (head != null) {
                head.previous = null;
            }
        }else if(node == tail){
            tail = node.previous;
            if(tail != null){
                tail.Next = null;
            }

        }else {
            node.previous.Next = node.Next;
            node.Next.previous = node.previous;
        }
        size--;
    }

    public void removeAll() {
        head = null;
        tail = null;
        size = 0;
    }

    public void setAt(int index, String data) {
        uaslp.objetos.list.linkedlist.Node node = findNode(index);
        if (node != null) {
            node.data = data;
        }
    }

    public String getAt(int index) {

        uaslp.objetos.list.linkedlist.Node node = findNode(index);
        return node == null ? null : node.data;
    }


    public Iterator getIterator() {
        return new uaslp.objetos.list.linkedlist.LinkedListIterator(head);
    }

    public int getSize() {
        return size;

    }

    private Node findNode(int index) {
        if (index < 0 || index >= size) {

            return null;
        }
        Node node = head;
        int currentIndex = 0;
        while (currentIndex != index) {

            currentIndex++;
            node = node.Next;
        }
        return node;
    }

}
