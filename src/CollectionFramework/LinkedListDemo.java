package CollectionFramework;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		 // class linked list
        LinkedList<String> ll = new LinkedList<String>();
 
        // Adding elements to the linked list
        ll.add("Harsh");
        ll.add("Diwas");
        ll.addLast("Manasi");
        ll.addFirst("Rishabh");
        ll.add(2, "Raunak");
 
        System.out.println(ll);
 
        ll.remove("Raunak");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
 
        System.out.println(ll);
    }

}


