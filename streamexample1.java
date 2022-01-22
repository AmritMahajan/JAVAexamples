/*
 * Create a list of strings Pune Mumbai Chennai Bangalore and Noida
 * Print those cities which are having length >5 using StreamAPI
 */
package sample;

import java.util.Arrays;
import java.util.List;

public class streamexample1 {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Pune", "Mumbai", "Chennai", "Bangalore", "Noida");
		cities.stream().filter(city -> city.length() > 5).forEach(System.out::println);
	}
}
