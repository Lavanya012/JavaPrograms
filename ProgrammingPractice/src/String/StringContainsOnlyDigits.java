package String;

import java.util.regex.Pattern;

public class StringContainsOnlyDigits {

	public static void main(String[] args) {

		String A = "1111www121212";

		
		/**
		 * Method 1- Using Pattern.matches 
		 */
		if(Pattern.matches("\\d+", A)==true)
		{
			System.out.println("All characters are digits");
		}
		
		else
		{
			System.out.println("All characters are not digits");
		}
		
		
		/**
		 * Method 2- Integer.parseInt(A)
		 */
		
		try{
			long c=Long.parseLong(A);
			System.out.println("All characters are digits");
			
		}
		catch(Exception e)
		{
			System.out.println("All characters are not digits ");
			
		}
		
		
		/**
		 * Method 3- Using Replace all digits from the string
		 */
		
		
		
		String B = A.replaceAll("\\d+", "");

		int size = B.length();

		if (size > 0) {
			System.out.println("All characters are not digits");
		}

		else {
			System.out.println("All characters are digits");
		}
	}

}
