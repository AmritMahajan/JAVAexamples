package sample;
import java.util.*;
public class hashmap2 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("Vishal", 10);
		map.put("Sachin", 15);
		map.put("Vaibhav", 20);
		System.out.println(map.size());
		System.out.println(map);
		if(map.containsKey("Vishal")) {
			System.out.println(map.get("Vishal"));
		}
		else {
			System.out.println("Vishal not found");
		}
		map.replace("Vaibhav", 50);
		System.out.println(map);
		map.remove("Sachin");
	}
}
