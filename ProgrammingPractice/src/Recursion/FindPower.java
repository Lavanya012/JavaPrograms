package Recursion;
/**

 pow(2,3)=2* pow(2,2) = 2*4
 pow(2,2)= 2* pow(2,1)= 2*2
 pow(2,1)=2* pow(2,0) = 2*1

 */
public class FindPower {

	public static void main(String[] args) {
		System.out.println(power(2, 3));

	}

	public static int power(int num, int pow) {

		if(pow!=0)
		{
			return num*power(num,pow-1);
		}
		else
		{
			return 1;
		}

	}

}
