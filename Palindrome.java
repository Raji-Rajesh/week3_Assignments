package week3.assignments;

public class Palindrome {
	public void palindrome(String str1, String str2) {
		int length=str1.length();
		System.out.println("String1 is: "+str1);
		for(int i=length-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		System.out.println("Reverse string is: "+str2);
		if(str1.equals(str2)) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not polimdrome");
		}
	}
	
	public static void main(String[] args) {
		Palindrome pali = new Palindrome();
		pali.palindrome("malayalam", "");
	}

}
