package String;

public class CapitalizeFirstLetterOfEachWord {

	public String capFirstLetter(String A) {
		String words[] = A.split("\\s+");
		String newString = "";

		for (String word : words) {
			
			System.out.println(word.substring(0,1));

			//Using Substring
			//newString = newString + word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
			
			//CharacterAt and SubString
			newString = newString + word.toUpperCase().charAt(0)+word.substring(1)+" ";
			
		}

		return newString;
	}

	public static void main(String[] args) {
		String A = "hello there";
		CapitalizeFirstLetterOfEachWord cfl = new CapitalizeFirstLetterOfEachWord();

		System.out.println(cfl.capFirstLetter(A));
	}

}
