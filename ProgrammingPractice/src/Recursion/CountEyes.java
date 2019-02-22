package Recursion;
/**

counteye(6)= 2+counteye(5);2+10=12
counteye(5)=2+counteye(4);=>2+8=10
counteye(4)=2+counteye(3);=>2+6=8
counteye(3)=2+counteye(2);=>2+4=6
counteye(2)=2+counteye(1); =>2+2=4
counteye(1)=2+counteye(0);=> 2+0=2
 */

public class CountEyes {

	public static void main(String[] args) {
		System.out.println(counteye(6));

	}

	private static int counteye(int n) {
	
		if (n == 0) {
			return 0;
		} else {

			return 2 + counteye(n - 1);

		}

	}

}
