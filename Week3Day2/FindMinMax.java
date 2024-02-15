package Week3Day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {87, 77, 15, 22, 35, 45, -8};
		int i;
		for(i=0;i<=6;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		Arrays.sort(nums);
		for(i=0;i<=6;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		System.out.println("The min value is " + nums[0]);
		System.out.println("The max value is "+  nums[nums.length-1]);
		
		
        
	}

}
