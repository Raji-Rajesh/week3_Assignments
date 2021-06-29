package week3.assignments;

public class SumOfDigits {
	public static void main(String[] args) {

		String text = "Tes12Le79af65";
		int sum = 0;
		
		String digits = text.replaceAll("\\D", " ");

		char[] digit = digits.toCharArray();
		
		for (int i = 0; i < digit.length; i++) {
			if (!(Character.isWhitespace(digit[i]))) {
				sum = sum + Character.getNumericValue(digit[i]);

			}
		}
		System.out.println("The sum of given values in the string is: "+sum);
	}
}
