package String;

public class CountTheNumberOfWordInString {
	
	public static void main(String[] args) {
		String a="Hello there  how  are you";
		
		//s - matches single whitespace character
		//s+ - matches sequence of one or more whitespace characters.
		
		String[] arr=a.split("\\s+");
		System.out.println(arr.length);
	}

}
