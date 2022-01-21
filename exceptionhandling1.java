/*
 Write a program to create method which will take 2 integers as an input and return the result(a/b)

 Catch the exception and print "Exception has been caught.Please provide valid input"
 There will be a message that a user wants to see all the time -- "Operation has completed"
 In case the values are divisible return output
  
  */
package sample;

import java.util.*;

public class exceptionhandling1 {
	static int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers  ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		try {
			int res = divide(a, b);
			System.out.println(res);
		} catch (Exception e) {
			System.out.println("Exception has been caught.Please provide valid input");
		} finally {
			System.out.println("Operation has completed");
		}

	}

}
