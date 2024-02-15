package week4day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++) {
			
			set.add(split[i]);
			
		}
		List<String>array = new ArrayList<String>(set);
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i)+" ");
			
		}
		
		
	}

}
