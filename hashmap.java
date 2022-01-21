package sample;

import java.util.*;
public class hashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jay");
		map.put(6, "Amit");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
