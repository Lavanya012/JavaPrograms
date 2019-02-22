package Array.Duplicates;

import java.util.LinkedHashSet;

public class RemoveDuplicateHashSet {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,1,2,3,3,3,3};
		
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		
		for(int item:arr)
		{
			set.add(item);
		}
		
		for(int val:set)
		{
			System.out.println(val);
		}

	}

}
