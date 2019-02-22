package Numbers;

public class FindPower {

	public static void main(String[] args) {
		System.out.println(power(4,3));

	}
	
	public static int power(int n,int base)
	{
		int sum=0;
		for(int i=base;i>1;i--)
		{
			sum=sum+(n*n);
		}
		
		return sum;
		
	}

}
