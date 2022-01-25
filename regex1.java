package sample;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidNumberException extends Exception {
	public InvalidNumberException() {
		System.out.println("Invalid phone number");
	}
}

public class regex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phone = sc.next();
		Pattern p = Pattern.compile("[6-9]{1}[0-9]{9}");
		Matcher m = p.matcher(phone);
		try {
			if (m.matches()) {
				System.out.println("Valid phone number");
			} else {
				throw new InvalidNumberException();
			}
		} catch (InvalidNumberException e) {
			System.out.println(e);
		}
	}

}
