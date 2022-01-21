package sample;

public class duplicatestrings {

	public static void main(String[] args) {
		String str = "great responsibility";
		String str2 = "";
		for (int i = 0; i < str.length() - 1; i++) {
			char c = str.charAt(i);
			String s = String.valueOf(c);
			for (int j = i + 1; j < str.length(); j++) {
				if (c == str.charAt(j) && str2.contains(s) == false) {
					System.out.print(str.charAt(i));
					str2 = str2.concat(s);
					break;
				}
			}
		}
	}
}
