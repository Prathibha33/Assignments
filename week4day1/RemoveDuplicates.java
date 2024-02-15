package week4day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String a = "PayPal India";
  char[] cs = a.toCharArray();
  Set<Character> charset = new LinkedHashSet<Character>();
  Set<Character> dset = new LinkedHashSet<Character>();
  
  for (int i = 0; i < cs.length; i++) {
	if(!charset.add(cs[i])){
		
	}
}
  System.out.println(dset);
  charset.removeAll(dset);
  System.out.print("desired string:");
  for(Character character : charset) {
	  if(character != ' ') {
		  System.out.print(character);
		  
	  }
  }
  
	}

}
