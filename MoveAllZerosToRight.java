package week3.assignments;

public class MoveAllZerosToRight {
	public static void main(String[] args) {
		int[] num = { 4, 0, 3, 0, 1, 5, 2, 0 };
		
		//To initialize a new array to store the results
		int[] newNum = new int[num.length];
		
		int length = num.length;
		int j = 0;
		int zeroValues = length - 1;

		for (int i = 0; i < length; i++) {
			if (num[i] == 0) {
				newNum[zeroValues] = num[i];

				zeroValues--;
			} else {
				newNum[j] = num[i];
				j++;
			}
		}
		
		//To display the result as expected
		System.out.print("The output is :");
		for (int i = 0; i < length; i++) {
			if(i!=length-1) {
			System.out.print(newNum[i]+",");
			}
			else {
				System.out.print(newNum[i]);
			}
		}

	}

}
