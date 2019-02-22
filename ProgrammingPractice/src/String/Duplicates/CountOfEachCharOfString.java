package String.Duplicates;

public class CountOfEachCharOfString {

	public static void main(String[] args) {
		String A="Hellooe";
		int count=1;
		String character;
		int length=A.length();
		
		while(length>0)
		{
			count=1;
			for(int j=1;j<length;j++)
			{
				if(A.charAt(0)==A.charAt(j))
				{
					count++;
				}
			}
			System.out.println(A.charAt(0)+":"+count);
			
			character=String.valueOf(A.charAt(0));
			A=A.replaceAll(character, "");
			length=length-count;
			
			
		}

	}

}
