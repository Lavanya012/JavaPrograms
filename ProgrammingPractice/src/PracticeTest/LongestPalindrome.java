package PracticeTest;

public class LongestPalindrome {

	public static void main(String[] args) {

		String A = "teet hele madam";
		String newword = "";
		int size = 0;
		int longestsize = 0;
		String longestPalindromeWord="";

		boolean isPalindrome = false;

		String[] words = A.split("\\s+");

		for (int i = 0; i < words.length; i++) {
			newword = "";
			size = words[i].length();
			for (int j = words[i].length() - 1; j >= 0; j--) {
				newword = newword + words[i].charAt(j);

			}

			if (newword.equals(words[i])) {
				isPalindrome = true;
				if(newword.length()>longestsize)
				{
					longestsize=newword.length();
					longestPalindromeWord=newword;
					
				}
				
				
			}

			

		}
		
		System.out.println(longestPalindromeWord+": "+longestsize);
	}

}
