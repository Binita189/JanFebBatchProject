package javaBasics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapHashTableConcept {
	
	// HashMap & HashTable -> key-value pair-> HashMap class -> HashTable class

	public static void main(String[] args) {
		HashMap hm = new HashMap(); // raw type/ non-parameterized 
//		HashMap<Character,String> hm = new HashMap<Character,String>(); // Parameterized
		
		// insert value -> value insertion based on hashcode
		hm.put('A', "Apple");
		hm.put('J',"Juice");
		hm.put('C', "Carrot");
		hm.put('B', "Ball");
		hm.put('K', "Kite");
//		System.out.println(hm);
		
		// extracting value
		System.out.println(hm.get('K'));
		System.out.println(hm.get('A'));
		System.out.println(hm.get('M'));
		
		// to get all keys
		Set<Character> keys = hm.keySet();
		System.out.println(keys);
		
		// to get all values
		Collection<String>htAllValues = hm.values();
		System.out.println(htAllValues);
		
		// to entryset value
		Set<Entry<Character, String>> valueSet = hm.entrySet();
		System.out.println(valueSet);
		System.out.println("Number of row in entry at: "+valueSet.size());
		
		// to remove values
		hm.remove('B');
		System.out.println(hm);
		
		System.out.println("Number of key-value pair: "+ hm.size());
		
		hm.replace('C', "Canada");
		System.out.println(hm);
		
		// dealing null
		hm.put(null, "Robert");
		hm.put('N', null);
		System.out.println(hm);
		
		Hashtable<Character, String> ht = new Hashtable<Character, String>();
		
		ht.put('A', "Apple");
		ht.put('J', "Juice");
		ht.put('C', "Carrot");
		ht.put('B', "Ball");
		ht.put('K', "Kite");

		// extracting value
		System.out.println(ht.get('K'));
		System.out.println(ht.get('A'));
		System.out.println(ht.get('M'));

		// to get all keys
		Set<Character> htkeys = ht.keySet();
		System.out.println(htkeys);
		
		// to get all values
		Collection<String> htAllValues1 = ht.values();
		System.out.println(htAllValues1);

		// dealing null
		ht.put(null, "Robert"); //NullPointerException: Cannot invoke "Object.hashCode"
		ht.put('N', null); // NullPointerException
		ht.put(null, null); // NullPointerException
		System.out.println(ht);
	}

}
