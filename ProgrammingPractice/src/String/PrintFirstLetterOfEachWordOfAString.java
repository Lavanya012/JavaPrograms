package String;

public class PrintFirstLetterOfEachWordOfAString {

	public String caps(String A) {
		String[] words = A.split("\\s+");
		String newString = "";

		for (int i = 0; i < words.length; i++) {

			newString = newString + words[i].charAt(0);

		}

		return newString;
	}

	public static void main(String[] args) {
		String A = "Hello There How Are You";
		PrintFirstLetterOfEachWordOfAString pp = new PrintFirstLetterOfEachWordOfAString();
		System.out.println(pp.caps(A));
	}

}
