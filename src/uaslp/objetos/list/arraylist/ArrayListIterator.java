package uaslp.objetos.list.arraylist;

import src.uaslp.objetos.list.Iterator;



public class ArrayListIterator implements Iterator {
    private Iterator arrayList;
    private int currentItem;

    public  ArrayListIterator( ArrayList arrayList) {
        this.arrayList = this.arrayList;
    }
    public boolean hasNext() {
        return currentItem < arrayList.getSize();
    }


    public String next() {
     String data = arrayList.getAt(currentItem);
     currentItem++;
     return data;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String getAt(int currentItem) {
        return null;
    }
}
