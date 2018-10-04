//First of many more topics

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		
		/* Lets make a HashMap
		 * Here are the possible constructors we can choose from:
		 * HashMap() - default constructor, initial capacity = 16, load factor = 0.75
		 * 			(The Initial capacity is the capacity of the HashMap when first created)
		 * 			(The Load Factor is usually a fraction (number between 0 and 1) that tells when to Rehash.
		 * 			Rehashing is the process of increasing the initial capacity. When the Hash Map is of a certain 
		 * 			fraction (load factor) full, it will start rehashing. 
		 * 
		 * HashMap(int initial capacity) - creates a Hash Map with the specified capacity and a load factor of 0.75.
		 * 
		 * HashMap(int initial capacity, float loadFactor) - creates a HashMap with the specified capacity and load factor.
		 * 
		 * HashMap(Map map) - creates an instance of HashMap with the same specifications of the specified map.
		 */
		HashMap<String,Integer> map = new HashMap<>();
		
		//Let's print the map to stdout
		System.out.println(map);
		
		//There should be nothing in it, Let's make it more useful
		
		//Add item to the Hash Map using the method .put(Key, Value)
		map.put("King", 0);
		
		//Let's print again and see what happens
		System.out.println(map);
		
	//To be continued
		
	}

	
	
	/*
	 * Sources:
	 *  https://www.geeksforgeeks.org/java-util-hashmap-in-java/
	 */
	
}
