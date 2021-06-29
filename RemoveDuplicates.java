package week3.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public void removeDuplicates(String str) {

		char[] charArray = str.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length - 1; i++) {
			if (!(Character.isWhitespace(charArray[i]))) {
				if (charSet.add(charArray[i])) {
					continue;
				} else {
					dupCharSet.add(charArray[i]);
				}
			}
		}
		System.out.println("Unique Characters: " + charSet);
		System.out.println("Duplicate Characters: " + dupCharSet);
	}

	public static void main(String[] args) {
		RemoveDuplicates rd = new RemoveDuplicates();
		rd.removeDuplicates("PayPal India");
	}

}
