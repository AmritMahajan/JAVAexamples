/*
 * Create a list of People Atul, Rishabh, Akshay, Suresh
 * Print name of those people whose name ends with l
 */

package sample;

import java.util.*;
public class streamexample2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Atul", "Rishabh", "Akshay", "Suresh");
		names.stream().filter(name -> name.endsWith("l")).forEach(System.out::println);
		for(String name:names) {
			if(name.endsWith("l")) {
				System.out.println(name);
			}
		}		
	}
}
