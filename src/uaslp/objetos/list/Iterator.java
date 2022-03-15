package src.uaslp.objetos.list;

public interface Iterator {
    boolean hasNext();
    String next();

    int getSize();

    String getAt(int currentItem);
}
