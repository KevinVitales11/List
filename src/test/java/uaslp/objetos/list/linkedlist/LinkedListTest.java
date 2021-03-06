package uaslp.objetos.list.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;
import uaslp.objetos.list.Iterator;

public class LinkedListTest {


   @Test
    public void givenANewList_whenGetSize_thenResultIsZero(){
       //given:
        LinkedList<String> list = new LinkedList<>();
       //when:
       int sizeOfList =list.getSize();

       //then:
    Assertions.assertEquals(0,sizeOfList,"Size of list after creation after creation must be zero ");

    }

    @Test
    public void   givenANewList_whenAddAnElement_thenSizeisOne () throws NotNullValuesAllowedException, NotValidIndexException {

       //Given
       LinkedList<String> list = new LinkedList<>();


       //When

        list.addAtFront("Hola");

        //Then
        int size = list.getSize();
       Assertions.assertEquals(1,size);
        Assertions.assertEquals("Hola",list.getAt(0));

    }
    @Test
    public void givenAListWithOneElement_whenAddAtFront_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        LinkedList<String> list=new LinkedList<>();

        list.addAtFront("Hola");

        //When:
        list.addAtFront("Mundo");

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(2,sizeOfList);
        Assertions.assertEquals("Mundo",list.getAt(0));
        Assertions.assertEquals("Hola",list.getAt(1));
    }

    @Test
    public void givenANewList_whenAddAtTail_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        LinkedList<String> list=new LinkedList<>();

        list.addAtTail("Hola");

        //When:
        int sizeOfList = list.getSize();

        //Then:
        Assertions.assertEquals(1,sizeOfList);
        Assertions.assertEquals("Hola",list.getAt(0));
    }

    @Test
    public void givenAListWithOneElement_whenAddAtTail_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given:
        LinkedList<String> list=new LinkedList<>();

        list.addAtTail("Hola");

        //When:
        list.addAtTail("Mundo");

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(2,sizeOfList);
        Assertions.assertEquals("Hola",list.getAt(0));
        Assertions.assertEquals("Mundo",list.getAt(1));
    }

    @Test
    public void givenAListWithOneElement_whenRemove_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); //Crea un objeto de la lista
        list.addAtFront("Hola");

        //When:
        list.remove(0);

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(0,sizeOfList);
    }

    @Test
    public void givenAListWithTwoElements_whenRemove_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); //Crea un objeto de la lista
        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        list.remove(0);

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(1,sizeOfList);
        Assertions.assertEquals("Mundo",list.getAt(0));
    }

    @Test
    public void givenAListWithTwoElements_whenRemoveIndex3_thenSizeIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); //Crea un objeto de la lista
        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:
        Assertions.assertThrows(NotValidIndexException.class,()->list.remove(3));
    }

    @Test
    public void givenAListWithTwoElements_whenAddAtFrontNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); //Crea un objeto de la lista
        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class,()->list.addAtFront(null));
    }

    @Test
    public void givenAListWithTwoElements_whenAddAtTailNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); //Crea un objeto de la lista
        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class,()->list.addAtTail(null));
    }

    @Test
    public void givenAListWithTwoElements_whenSetAtTailNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); //Crea un objeto de la lista
        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class,()->list.setAt(0,null));
    }

    @Test
    public void givenAListWithTwoElements_whenSetAtIndex3_thenSizeIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); //Crea un objeto de la lista
        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        //Then:
        Assertions.assertThrows(NotValidIndexException.class,()->list.setAt(3,"Valor"));
    }

    @Test
    public void givenAListWithTwoElements_whenRemoveIndex1_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); //Crea un objeto de la lista
        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When:
        list.remove(1);

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(1,sizeOfList);
        Assertions.assertEquals("Hola",list.getAt(0));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveIndex1_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); //Crea un objeto de la lista

        list.addAtTail("Mundo");
        list.addAtTail("jeje");
        list.addAtFront("Hola");

        //When:
        list.remove(1);

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(2,sizeOfList);
        Assertions.assertEquals("Hola",list.getAt(0));
        Assertions.assertEquals("jeje",list.getAt(1));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveElementAtTail_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); //Crea un objeto de la lista

        list.addAtFront("Hola");
        list.addAtTail("Mundo");
        list.addAtTail("adios");

        //When:
        list.remove(2);

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(2,sizeOfList);
        Assertions.assertEquals("Hola",list.getAt(0));
        Assertions.assertEquals("Mundo",list.getAt(1));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveAll_thenSizeIsZero() throws NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); //Crea un objeto de la lista

        list.addAtFront("hola");
        list.addAtTail("adios");
        list.addAtTail("jiji");

        //When:
        list.removeAll();

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(0,sizeOfList);
    }

    @Test
    public void givenAListWithTwoElements_whenSetAt_thenElementIsModified() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); //Crea un objeto de la lista

        list.addAtTail("Mundo");
        list.addAtFront("Adi??s");

        //When:
        list.setAt(0,"Hola");

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(2,sizeOfList);
        Assertions.assertEquals("Hola",list.getAt(0));
        Assertions.assertEquals("Mundo",list.getAt(1));
    }

    @Test
    public void givenAListWithThreeElements_whenGetIterator_thenIteratorWorksOverThreeElements() throws NotNullValuesAllowedException {
        //Given:
        LinkedList<String> list=new LinkedList<>(); //Crea un objeto de la lista

        list.addAtFront("hola");
        list.addAtTail("Mundo");
        list.addAtTail("kevin");

        //When:
        Iterator<String> iterator = list.getIterator();

        //Then:
        int sizeOfList = list.getSize();

        Assertions.assertEquals(3,sizeOfList);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("hola",iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Mundo",iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("kevin",iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    public void givenANewList_whenGetAt_thenExceptionIsThrown(){
        //Given:
        LinkedList<String> list=new LinkedList<>(); //Crea un objeto de la lista

        //When:
        try {
            list.getAt(0);
            Assertions.fail("An exception should be thrown getting element zero");
        }catch (NotValidIndexException ex){
            //Exception was Thrown
        }

    }

}
