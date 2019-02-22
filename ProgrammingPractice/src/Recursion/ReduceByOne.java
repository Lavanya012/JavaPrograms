package Recursion;

public class ReduceByOne {

	public static void main(String[] args) {
	
		reduceByOne(10);

	}

	private static void reduceByOne(int i) {
		
		if(i==0)
		{
			return;
		}
		
		else
		{
			System.out.println(i);
			reduceByOne(i-1);
			
		}
		
	}
	
	

}
