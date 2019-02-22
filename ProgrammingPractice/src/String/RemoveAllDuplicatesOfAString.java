package String;

import java.util.LinkedHashSet;

public class RemoveAllDuplicatesOfAString {

	public static void main(String[] args) {

		String A = "hellowwh";
		char[] arr = A.toCharArray();
		
		
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		
		for (Character character : arr) {
			if(!set.contains(character))
			{
				set.add(character);
			}
			
		}
		
		for (Character val : set) {
			System.out.print(val);
		}
		
		

	}

}
