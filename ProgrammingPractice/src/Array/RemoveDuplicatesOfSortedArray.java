package Array;

public class RemoveDuplicatesOfSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 3, 4, 4, 5, 5,6 };
		int[] temp = new int[arr.length];
		int k = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[k] = arr[i];
				k++;
			}
		}
		
		//This is only for last element
		temp[k++]=arr[arr.length-1];
		
		for (int i = 0; i < k; i++) {
			arr[i]=temp[i];
		}
		
		for (int i = 0; i < k; i++) {
			System.out.println(arr[i]);
		}
	}
}
