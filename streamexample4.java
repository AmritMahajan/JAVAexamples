/*
 * Create a list of elements 5 7 13 9 1
 * Find out the sum of those values which are greater than 2 using Stream APIs
 */
package sample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamexample4 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5,7,13,9,1);
		Optional<Integer> result = nums.stream().filter(num->num>2).reduce((a,b)->a+b);
		if(result.isPresent()) {
			System.out.println(result.get());
		}
	}
}
