package sample;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("apple");
		list.add("banana");
		list.add("grapes");
		
		for(String i:list) {
			System.out.println(i);
		}
		
		Iterator it =list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		list.set(1, "dates");
		System.out.println(list.get(2));
		System.out.println(list.contains("apple"));
		Collections.sort(list);
		for(String i:list) {
			System.out.println(i);
		}
	}

}
