/*
 * Create a list of integers 12 18 25 30
 * Find maximum element of this list using Stream API
 * Find out the count of elements present in the list
 * Find out 1st element of the list
 */
package sample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class streamex6 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(12, 18, 25, 30);
		Optional<Integer> result = nums.stream().reduce((a, b) -> a > b ? a : b);
		if (result.isPresent()) {
			System.out.println(result.get());
		}
		System.out.println(nums.stream().count());
		nums.stream().limit(1).forEach(System.out::println);
	}
}
