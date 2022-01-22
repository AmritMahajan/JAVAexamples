/*
 * Create a list of airlines AirIndia Vistara Spicejet Indigo AirAsia
 * Print length of each of the airlines
 */
package sample;

import java.util.*;
public class streamexample3 {
	public static void main(String[] args) {
		List<String> airlines = Arrays.asList("AirIndia", "Vistara", "SpiceJet", "Indigo","AirAsia");
		airlines.stream().map(str->str.length()).forEach(System.out::println);
	}
}
