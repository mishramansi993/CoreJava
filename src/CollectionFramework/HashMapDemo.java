package CollectionFramework;
import java. util.*;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		//Creating HashMap
		//Put elements in Hashmap
		hm.put(1,"Manasi");
		hm.put(2, "Harh");
		hm.put(3, "Diwas");
		hm.put(4, "Komal");
		hm.put(5, "Anupam");
		hm.put(6,null );
		hm.put(null, "Rishabh");
		hm.put(null, null);
		
		System.out.println("Iterating HashMap...");
		for(Entry<Integer, String> m : hm.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }
	}

}
