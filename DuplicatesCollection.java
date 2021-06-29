package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesCollection {
	public static void main(String[] args) {

		int[] input = { 1, 3, 8, 3, 11, 5, 6, 4, 7, 6, 7 };
		// output should be 3,6,7
		Set<Integer> uniqueIntegers = new LinkedHashSet<Integer>();
		Set<Integer> duplicateIntegers = new LinkedHashSet<Integer>();
		for (int i = 0; i < input.length; i++) {
			if (uniqueIntegers.add(input[i])) {
				continue;
			} else {
				duplicateIntegers.add(input[i]);
			}

		}
		System.out.println("Dulicate values are: " + duplicateIntegers);

	}
}
