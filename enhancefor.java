//create array of size 5 - 10 20 30 40 50 //print contents using for and enhanced  for loop

package sample;

public class enhancefor {
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 10;arr[1] = 20;
		arr[2] = 30;arr[3] = 40;
		arr[4] = 50;
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
