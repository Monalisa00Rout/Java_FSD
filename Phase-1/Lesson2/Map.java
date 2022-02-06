package practice.project;

import java.util.*;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		// map

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Mona");
		hm.put(2, "Sona");
		hm.put(3, "Radha");

		System.out.println("\nThe elements of Hashmap are ");
		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(4, "Gendu");
		ht.put(5, "Chuinn");
		ht.put(6, "Giggy");
		ht.put(7, "Diksha");

		System.out.println("\nThe elements of HashTable are ");
		for (Entry<Integer, String> n : ht.entrySet()) {
			System.out.println(n.getKey() + " " + n.getValue());
		}

		// TreeMap

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Anisha");
		map.put(9, "Chita");
		map.put(10, "Catrina");

		System.out.println("\nThe elements of TreeMap are ");
		for (Entry<Integer, String> l : map.entrySet()) {
			System.out.println(l.getKey() + " " + l.getValue());
		}

	}
}
