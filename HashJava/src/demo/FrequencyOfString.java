package demo;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class FrequencyOfString {

	public static void main(String[] args) {

		String arr[] = { "google", "wiki", "facebook", "bing", "google", "google", "bing", "alphabet" };

		List<String> list = Arrays.asList(arr);

		TreeMap<String, Integer> tmap = new TreeMap<>();

		for (int i = 0; i < list.size(); i++) {

			Integer val = tmap.get(list.get(i));

			if (val == null) {
				tmap.put(list.get(i), 1);
			} else {
				tmap.put(list.get(i), val + 1);
			}

		}

		int k = 0;
		int l = 0;
		int freq[] = new int[tmap.values().size()];
		String key[] = new String[tmap.keySet().size()];

		for (Integer x : tmap.values()) {
			freq[k] = x;
			k++;
		}

		for (String y : tmap.keySet()) {
			key[l] = y;
			l++;
		}

		System.out.println(tmap.entrySet());

		int n = freq.length;
		int temp;
		String temp1;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (freq[j] < freq[j + 1]) {
					temp = freq[j];
					freq[j] = freq[j + 1];
					freq[j + 1] = temp;

					temp1 = key[j];
					key[j] = key[j + 1];
					key[j + 1] = temp1;

				}
			}
		}

		for (int i = 0; i < freq.length; i++) {
			System.out.print(freq[i] + "       ");
		}

		System.out.println();

		for (int i = 0; i < key.length; i++) {
			System.out.print(key[i] + " ");
		}

	}
}
