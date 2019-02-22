package String;

public class SmallestWordOfAString {
	
	public static void main(String[] args) {
		String a="hellow there how are ur";
		String[] words=a.split("\\s+");
		int wordLength=0;
		int smallestWordLength=words[0].length();
		String smallestWord=words[0];
		
		for(int i=1;i<words.length;i++)
		{
			
			wordLength=words[i].length();
			
			if(smallestWordLength>wordLength)
			{
				smallestWord=words[i];
				smallestWordLength=wordLength;
			}
			
		}
		
		System.out.println(smallestWord+":-"+smallestWordLength);
	}

}
