package Recursion;
/**
fact(5) = 5*fact(4)= 5*24= 120

fact(4) = 4*fact(3) = 4*6

fact(3) = 3* fact(2) = 3*2

fact(2) = 2* fact(1) == 2*1
 */

public class Factorial {

	public static void main(String[] args) {

		System.out.println(fact(5));

	}

	private static int fact(int n) {
		
		if(n==0 || n==1)
		{
			return 1;
		}
		
		else
		{
			return n*fact(n-1);
		}
	
	}

}
