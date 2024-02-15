package Week3Day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String text1 = "stops";
       String text2 = "potss";
       
	  
       if(text1.length() == text2.length()) {
    	   char[] cs = text1.toCharArray();
    	   char[] cs2 = text2.toCharArray();
    	   Arrays.sort(cs);
           Arrays.sort(cs2);
           boolean b = Arrays.equals(cs, cs2);
           if(b == true) {
        	   System.out.println("given strings are anagrams");
           }else {
        	   System.out.println("given strins are not anagrams");
           }
       }
       
	}}  
      
       
       
       
       
       

	
	


