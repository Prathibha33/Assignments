package Week3Day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String test = "changeme";
     char[] char1 = test.toCharArray();
     for (int i = 0; i < char1.length; i++) {
		if(i%2!=0) {
			char s = char1[i];
			System.out.print(Character.toUpperCase(s));
		}else {
			System.out.print(char1[i]);
		}
	}
     
	}

}
