package String;

public class ReturnCountOfAllTypeOfCharacterFromEmail {

	public static void main(String[] args) {
		String A="a_1@gmail.com";
		char[] arr=A.toCharArray();
		int digitcount=0;
		int letterCount=0;
		int specialCount=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isDigit(arr[i]))
			{
				digitcount++;
			}
			
			else if(Character.isLetter(arr[i]))
			{
				letterCount++;
			}
			
			else
			{
				specialCount++;
			}
		}
		
		System.out.println(digitcount);
		System.out.println(letterCount);
		System.out.println(specialCount);
		

	}

}
