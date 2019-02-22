package Array;

public class FindAMissingNumberInIntegerArray {
	
	
	public static void main(String[] args) {
		
		int [] arr={1,2,3,4,5,6,7,8,9};
		int sumOfOriginal=0;
		int sumOfarr=0;
		int missingNum=0;
		
		for(int i=1;i<=10;i++)
		{
			sumOfOriginal=sumOfOriginal+i;
		}
		
		for(int j=1;j<=arr.length;j++)
		{
			sumOfarr=sumOfarr+j;
		}

		missingNum=sumOfOriginal-sumOfarr;
		System.out.println(sumOfOriginal);
		System.out.println(sumOfarr);
		System.out.println(missingNum);
	}

}
