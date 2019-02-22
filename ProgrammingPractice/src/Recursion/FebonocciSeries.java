package Recursion;
/**
fibonacci(5) = fibonacci(4) + fibonacci(3) == 3+2

fibonacci(4) = fibonacci(3) + fibonacci(2)== 2+1

fibonacci(3) = fibonacci(2) + fibonacci(1) == 1 +1

fibonacci(2) = fibonacci(1) + fibonacci(0)== 1+0
 */


public class FebonocciSeries {

	public static void main(String[] args) {
		System.out.println(febbonocci(5));

	}

	private static int febbonocci(int n) {
		if(n==0 || n==1)
		{
			return 1;
		}
		
		else
		{
		return febbonocci(n-1)+febbonocci(n-2);
		
		
		}
		
		
	}

}
