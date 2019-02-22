package String;

public class StringIsPalindrome {
	
	
	public static void main(String[] args) {
		String A="tet";
		StringIsPalindrome sp= new StringIsPalindrome();
		System.out.println(sp.isPalindrome(A));
	}

	private boolean isPalindrome(String A) {
		
		String reverse="";
		
		for(int i=A.length()-1;i>=0;i--)
		{
			reverse=reverse+A.charAt(i);
		}
				
		if(reverse.equals(A))
			return true;
		
		return false;
	}

}
