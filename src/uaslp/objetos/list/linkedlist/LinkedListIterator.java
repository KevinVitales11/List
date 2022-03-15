package uaslp.objetos.list.linkedlist;

import src.uaslp.objetos.list.Iterator;

public class LinkedListIterator implements Iterator {

    private uaslp.objetos.list.linkedlist.Node currentNode;

    LinkedListIterator(uaslp.objetos.list.linkedlist.Node startNode) {
       currentNode = startNode;

    }

    public boolean hasNext() {
        return currentNode != null;
    }


    public String next() {
        String data = currentNode.data;
        currentNode = currentNode.Next;
        return data;
    }
}
