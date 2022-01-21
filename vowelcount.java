// This is  a really simple sentence. Count of vowels and consonants.
package sample;

public class vowelcount {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		String str = "This is a really simple sentence.";
		for (int i = 0; i < str.length(); i++) {
			char c = str.toLowerCase().charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				a++;
			} else if (c >= 'a' && c <= 'z') {
				b++;
			}
		}
		System.out.println(a + " " + b);
	}
}
