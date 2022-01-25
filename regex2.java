package sample;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phone = sc.next();
		Pattern p = Pattern.compile("[6-9]{1}[0-9]{9}");
		Matcher m = p.matcher(phone);

	}

}
