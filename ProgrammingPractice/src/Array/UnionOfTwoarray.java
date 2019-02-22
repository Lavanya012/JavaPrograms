package Array;

public class UnionOfTwoarray {

	public static void main(String[] args) {
		int[] arr1 = { 21, 34, 41, 22, 35 };
		int[] arr2 = { 61, 34, 45, 21, 11 };
		int[] temp = new int[arr1.length + arr2.length];
		int k=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			temp[k++]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				
			}

		}
		

	}

}
