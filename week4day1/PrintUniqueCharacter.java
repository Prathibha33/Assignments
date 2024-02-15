package week4day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s ="prathiba";
     char[] charArray = s.toCharArray();
     Set<Character> a = new LinkedHashSet<Character>();
     
     for (int i = 0; i < charArray.length; i++) {
    	 a.add(charArray[i]);
     }
     for(Character character : a) {
    	 System.out.print(character);
     }
		
	}

}
