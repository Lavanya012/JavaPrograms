package String;

public class LargestWordOfAString {
	
	public static void main(String[] args) {
		String A="hello theree how are youuuuuu";
		String[] words=A.split(" ");
		int largetWordLength=0;
		int wordlength=0;
		String largestWord="";
		
		for(String word:words)
		{
			wordlength=word.length();
			
			if(wordlength>largetWordLength)
			{
				largetWordLength=wordlength;
				largestWord=word;
			}
		}
		
		System.out.println(largestWord+":-"+largetWordLength);
		
	}

}
