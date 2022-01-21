package sample;

public class stringmethods {

	public static void main(String[] args) {
		String str="hello";
		str=str.concat(" world");
		System.out.println(str);
		System.out.println(str.indexOf('h'));
		System.out.println(str.isEmpty());
		String str2="HELLO WORLD";
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareToIgnoreCase(str2));
		System.out.println(str.contains("h"));
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.endsWith("d"));
		System.out.println(str.charAt(1));
		System.out.println(str.replace("e", "m"));
			
	}

}
