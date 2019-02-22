package String;

/**
 * 
Character.isLetter('c');
Character.isDigit('c');
Character.isLetterOrDigit('c');
Character.isSpaceChar(' ');
Character.isLowerCase('c');
Character.isUpperCase('c');
 *
 */


public class ReturncountOfeachcharacter {

	public static void main(String[] args) {
		String A="abc_123@gmail.com";
		int scount=0;
		int dcount=0;
		int ccount=0;
	
		
		for(int i=0;i<A.length();i++)
		{
			if(Character.isLetter(A.charAt(i)))
			{
				ccount++;
				
			}
			else if(Character.isDigit((A.charAt(i))))
			{
				dcount++;
			}
			else
			{
			
				scount++;
			}
		}
		
		System.out.println("Characters :"+ccount);
		System.out.println("digits :"+dcount);
		System.out.println("special :"+scount);
		

		
	}

}
