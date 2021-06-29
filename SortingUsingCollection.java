package week3.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SortingUsingCollection {
	public static void main(String[] args) {

		String[] input = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		TreeSet<String> values = new TreeSet<String>();
		int length = input.length;
		for (int i = 0; i < length; i++) {
			values.add(input[i]);
		}
		System.out.println("Sorted String array values: " + values);

		// Coping values of Set into List as Set don't have get() method.
		List<String> listValues = new ArrayList<String>(values);

		// Printing the values of List in reverse order
		for (int i = length - 1; i >= 0; i--) {
			String string = listValues.get(i);
			if (i != 0) {
				System.out.print(string + ",");
			}
			else {
				System.out.print(string);
			}
		}
	}
}
