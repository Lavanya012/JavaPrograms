package Array.Duplicates;

import java.util.HashSet;

public class CheckIfDuplicatesHashSet {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8,1,2 };
		
		HashSet<Integer> set= new HashSet<>();
		
		for(int a:arr)
		{
			if(set.add(a)==false)
			{
				System.out.println("Array has duplicates");
				break;
			}
		}

	}

}
