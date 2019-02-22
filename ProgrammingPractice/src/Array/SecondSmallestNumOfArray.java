package Array; 

public class SecondSmallestNumOfArray
{
	public static void main(String[] args) {
		
		int [] arr={15,12,13,4,5,6};
		
		int smallest,secSmallest;
		
		smallest=secSmallest=Integer.MAX_VALUE;
		
		for(int a:arr)
		{
			if(smallest>a)
			{
				secSmallest=smallest;
				smallest=a;
			}
			
			if(secSmallest>a && a!=smallest)
			{
				secSmallest=a;
			}
		}
		
		System.out.println(secSmallest);
	}
	
	
}