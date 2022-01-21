package sample;

public class SBexample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Content Writer");
		System.out.println(sb.length());
		sb.append(" demo");
		System.out.println(sb);
		sb.insert(1, "son");
		System.out.println(sb);
		System.out.println(sb.reverse());
		sb.deleteCharAt(0);
		System.out.println(sb);
	}
}
