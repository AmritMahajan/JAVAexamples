/* Create a custom exception InvalidAgeException 
 * This exception can have variable age
 * Take age input from user and validate whether the user is above 18 then Show the output as You are allowed to vote.
 * if user is below 18, throw InvalidAgeException and print message that (age) is not a valid age to vote.
 */
package sample;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	public InvalidAgeException(int age) {
		System.out.println(age + " is not a valid age to vote");
	}
}

public class exceptionhandling2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
			if (age >= 18) {
				System.out.println("You are allowed to vote");
			} else {
				throw new InvalidAgeException(age);
			}
		} catch (Exception e) {
			System.out.print("");
		}
	}

}
