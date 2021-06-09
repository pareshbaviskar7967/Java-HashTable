package hashtable;

import java.util.Map.Entry;
import java.util.Hashtable;

public class HashTable {
	public static void countWordFreq(Hashtable<String, Integer> hashtable, String string) {

		String arr[] = string.split(" ");

		for (int i = 0; i < arr.length; i++) {
			if (hashtable.containsKey(arr[i])) {
				hashtable.put(arr[i], hashtable.get(arr[i]) + 1);
			} else
				hashtable.put(arr[i], 1);
		}

		for (Entry<String, Integer> entry : hashtable.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		Hashtable<String, Integer> hashtable = new Hashtable<>();

		System.out.println("Frequency count for Sentence 1 \nTo be or not to be");
		String string = "To be or not to be";
		countWordFreq(hashtable, string);
	}
}
