package sample;
import java.util.*;
public class treeset {

	public static void main(String[] args) {
		
		TreeSet<String> ts =new TreeSet<String>();
		ts.add("C");
		ts.add("A");
		ts.add("B");
		for(String s: ts) {
			System.out.println(s);
		}	
	}
}
