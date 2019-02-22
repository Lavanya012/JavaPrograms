package String.Duplicates;

import java.util.LinkedHashSet;

public class RemoveDuplicatesByHashSet {

	public static void main(String[] args) {
		String A="Hello";
		char[] arr=A.toCharArray();
		LinkedHashSet<Character> set= new LinkedHashSet<>();

		for(char cc:arr)
		{
			set.add(cc);
		}
		
		for(char ss:set)
		{
			System.out.print(ss);
		}
	}

}
