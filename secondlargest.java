//srrsy of elements 5 6 10 2 8 Operations- find 2nd largest element of array,find sum of all elements
package sample;

public class secondlargest {

	public static void main(String[] args) {
		int arr[] = { 5, 6, 10, 2, 8 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int max2;
		if (arr[0] != max) {
			max2 = arr[0];
		} else {
			max2 = arr[1];
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max && arr[i] > max2) {
				max2 = arr[i];
			}
		}
		System.out.println(max2);

	}

}
