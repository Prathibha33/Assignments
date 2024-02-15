package Week3Day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] split = test.split(" ");
		for (int i = 0; i < split.length; i++) {
			if(i%2!=0) {
				char[] charArray = split[i].toCharArray();
				for (int j = charArray.length-1 ; j >=0 ; j--) {
					System.out.print(charArray[j]);
				}
				System.out.print(" ");
			}
			else {
				System.out.print(split[i]+" ");
			}
		}
	}

}
