import uaslp.objetos.list.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
       LinkedList team1 = new LinkedList();
       LinkedList team2 = new LinkedList();

       team1.addTail("Jesus");
       team1.addTail("Jose");
       team1.addTail("Kevin");

       team2.addAtFront("Diego");
       team2.addAtFront("Daniel");
       team2.addAtFront("Cristian");
}}
