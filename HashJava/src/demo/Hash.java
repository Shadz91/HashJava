package demo;

import java.util.HashMap;

import java.util.Map.Entry;

public class Hash {
	public static void main(String args[]) {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(15, "Shadab");
		hm.put(12, "Waqas");
		hm.put(19, "Kohli");
		hm.put(0, "Aanchal");
		hm.put(24, "Nimisha");

		System.out.println("Value at Key(19): " + hm.get(19));
		System.out.println();

		System.out.println(hm);
		System.out.println();

		for (Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		System.out.println();

		System.out.print("Keys: ");
		for (Integer key : hm.keySet()) {
			System.out.print(key + ", ");
		}

		System.out.println("\n");
		System.out.print("Values: ");

		for (String value : hm.values()) {
			System.out.print(value + ", ");
		}

	}
}