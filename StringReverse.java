package week3.assignments;

public class StringReverse {
	public void stringReverse(String test) {
		for(int i=test.length()-1;i>=0;i--) {
			System.out.print(test.charAt(i));
		}
		
	}
	public static void main(String[] args) {
		StringReverse strrev=new StringReverse();
		strrev.stringReverse("feeling good");
	}
}
