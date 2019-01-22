package demo;

import java.util.HashMap;

public class FrequencyOfCharacter {

	public static void main(String[] args) {

		String st = "ssshhadab";
		int l = st.length();

		HashMap<Character, Integer> hmap = new HashMap<>(); // Empty hmap

		for (int i = 0; i < l; i++) {

			char ch = st.charAt(i);

			Integer val = hmap.get(ch);

			if (val == null) {
				hmap.put(ch, 1);
			} else {
				hmap.put(ch, val + 1);
			}

		}

		System.out.println(hmap.entrySet());

	}
}
