package week3.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			if ((i + 1) != arr[i]) {
				System.out.println("Missing number in the given array is: " + (i + 1));
				break;
			}
		}
	}

}
