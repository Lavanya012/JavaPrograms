package Array;

public class LargestNumberOfarray {
	
	public static void main(String[] args) {
		
		int[] arr={10,2,3,4,5};
		int largestNum=0;
		
		for(int a:arr)
		{
			if(a>largestNum)
			{
				largestNum=a;
			}
		}
		
		System.out.println(largestNum);
		
	}

}
