package week3.assignments;

public class ReverseEvenWords {
	public void reverseEvenWords(String test) {
		String[] splitArray = test.split(" ");
		for(int i=0;i<splitArray.length;i++) {
			if(i%2==1) {
				for(int j=splitArray[i].length()-1;j>=0;j--) {					
					System.out.print(splitArray[i].charAt(j));
				}
				System.out.print(" ");
			}
			else 
			{
				System.out.print(splitArray[i]);
				System.out.print(" ");
			}
		}
			
	}
	public static void main(String[] args) {
		ReverseEvenWords rev=new ReverseEvenWords();
		rev.reverseEvenWords("I am a software tester");
	}
}
