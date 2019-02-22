package String.Duplicates;

import java.util.HashSet;

public class CheckIfStringHasDuplicatesHashMap {

	public static void main(String[] args) {
		String A="Hello";
		
		HashSet<Character> set= new HashSet<>();
		
		for(int i=0;i<A.length();i++)
		{
			if(set.add(A.charAt(i))==false)
			{
				System.out.println("Duplicates found");
				break;
			}
		}

	}

}
