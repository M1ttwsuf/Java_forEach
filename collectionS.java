import java.util.*;
/*
Topic: Difference between Collection and Collections in java.

public interface Collection<E> extends Iterable<E>
Type Parameters: E - the type of elements returned by this iteratorclass collectionS 

public class Collections extends Object

Collection(Framework): interface like single unit(a group of indivisual objects as an single unit). It is used to represent a group of individual objects as a single unit. 
static method in java 8 ,abstract method, default method.
such as like List, Set, Queue
(inheri the collection of the interface)

(The Map interface is also part of the java collection framework,
 but it doesn’t inherit the collection of the interface.)

Collections: utility class. It contains only static methods.
such as like sort(), addAll()..
*/
class collectionS{

    public static void main(String[] args){

    // Creating an object method List<String>
    List<String> arrayList = new ArrayList<String>();

    //adding elements to arrayList
    arrayList.add("geeks");
    arrayList.add("for");
    arrayList.add("geeks");

    System.out.println("Elements of arrayList before the operations:");
    System.out.println(arrayList);

    System.out.println("Elements of arrayList after the operations:");



      //Adding all the specified elements to the specified collection
      Collections.addAll(arrayList,"web","site");
     
      // Printing the arrayList after performing addAll() methed 
      System.out.println(arrayList);
    
      // Sorting all the elments of the specified collection according to default sorting order
      Collections.sort(arrayList);
       
      
      //printing the arrayList after performing sort()method
      System.out.println(arrayList);
}

}