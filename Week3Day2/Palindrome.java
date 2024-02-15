package Week3Day2;

public class Palindrome {
	

	public static void main(String[] args) {
		
		String s = "madam";
		String rev = "";
		char[] b = s.toCharArray();
		
		for (int i = s.length()-1; i >= 0; i--) {
			rev=rev+b[i];
		}
		
		
  if (s.equals(rev)) {
	  
	  System.out.println("given string is a Palindrome");
  }
  else {
	  System.out.println("given string is not a Palindrome");
  }}
	

}
