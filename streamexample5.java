/*
 * Create a list of elements 6,7,2,5 and print the maximum value out of this list
 */
package sample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamexample5 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5, 7, 13, 9, 1);
		Optional<Integer> result = nums.stream().reduce((a, b) -> a > b ? a : b);
		if (result.isPresent()) {
			System.out.println(result.get());
		}
	}
}
