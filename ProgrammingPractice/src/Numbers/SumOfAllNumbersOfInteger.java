package Numbers;

public class SumOfAllNumbersOfInteger {
	
	public static void main(String[] args) {
		
		int A=1234;
		int sum=0;
		int rem;
		
		while(A>0)
		{
			rem=A%10;
			sum=sum+rem;
			A=A/10;
			
		}
		
		System.out.println(sum);
	}

}
