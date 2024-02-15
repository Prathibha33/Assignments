package week4day1;

public class MajorityElement {

	public static void main(String[] args) {
int[] nums = {3,2,3};
		
		int count =0,temp=0,count_=0;
		
		for(int i=0 ;i<nums.length;i++)
		
		{
			count=0;
			for(int j=0;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				//3=3,3=2,3=3
				{
					count++;//COUNT=2
				}
			}
			
			if(count>nums.length/2)//2>1
			{
				temp=nums[i];//3,2,3
				count_=count;//2
			}
			
			
		}
		if(count_>nums.length/2)///2>1
		{
		System.out.println("majority element is ====> "+temp);
		}
		else
		{
			System.out.println("No majority element");
		}

	}

}
