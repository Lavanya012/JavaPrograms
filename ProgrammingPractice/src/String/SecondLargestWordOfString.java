package String;

/**
a) If the current element in array say arr[i] is greater than first. Then
update first and second as, second = first first = arr[i] 
b) If the current element is in between first and second, then update second to store the value
of current variable as second = arr[i]
*/
public class SecondLargestWordOfString {

	String A = "helloooo there how are u ";
	String[] words = A.split("\\s+");
	int size = 0;
	int largestWordLength = 0;
	int secondLargestLength = 0;
	String largestWord = "";
	String secondLargestWord = "";

	public void largestWord() {

		for (String word : words) {

			size = word.length();

			if (size > largestWordLength) {

				secondLargestLength = largestWordLength;
				secondLargestWord = largestWord;
				largestWord = word;
				largestWordLength = size;

			}

			/*if (word.length() > secondLargestLength && word.length() != largestWordLength) {
				secondLargestLength = word.length();
				secondLargestWord = word;
			}*/

		}

		System.out.println(largestWordLength);
		System.out.println(secondLargestLength);

	}

	public static void main(String[] args) {

		SecondLargestWordOfString ss = new SecondLargestWordOfString();
		ss.largestWord();
	}

}
