package week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] x = {1,4,3,6,5,1};
  TreeSet<Integer> set = new TreeSet<Integer>();
  for (int i = 0; i < x.length; i++) {
	  set.add(x[i]);
	
}
 List<Integer>list = new ArrayList<Integer>(set);
 int missingNum = 0;
  for (int i = 0; i < list.size(); i++) {
	  missingNum = i+1;
	  if(list.get(i) != missingNum) {
		  System.out.println(missingNum);
		  break;
	  }
	
}

}
}
