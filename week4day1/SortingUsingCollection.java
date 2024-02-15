package week4day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String[] comp = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
   int length = comp.length;
   List<String> list = new ArrayList<String>();
   for (int i = 0; i < length; i++) {
	list.add(comp[i]);
}
   Collections.sort(list);
   for (int i = list.size(); i>0;i--) {
	   if(i!=0) {
		   System.out.print(list.get(i-1)+",");
		   
	   }
	   else {
		   System.out.println(list.get(i));  
	   }
	
	}

}}
