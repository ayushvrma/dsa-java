package Lists.JDK;
import java.util.Iterator;
import java.util.LinkedList;
import Lists.array_list;

public class jdk_linkedlist {
    public static void main(String[] args) {
        array_list oyus = new array_list("Oyus", "Verma", 6969);
        array_list unsa = new array_list("unsa", "sachan", 420);
        array_list dkarla = new array_list("dee", "Karla", 42069);

        LinkedList<array_list> list = new LinkedList<>();
        list.addFirst(oyus);
        list.addFirst(unsa);
        list.addFirst(dkarla);


        list.add(new array_list("ashwit", "sharma", 42000)); //adds to the end of the Linked List addLast() same method

        list.removeFirst(); //same as remove() method
        list.removeLast(); 

        Iterator iter = list.iterator();

        System.out.println("head--> ");
        while(iter.hasNext())
        {
            System.out.print(iter.next());
            System.out.print("<->");
        }
        System.out.println("null");

        // for(array_list employee: list)
        // {
        //     System.out.println(employee);
        // } Also can be done like this
    
        list.add(new array_list("ashwit", "sharma", 42000));
    
    }    
}
/*
It is a doubly linked list implementation

*/
