package String.Duplicates;

public class CheckIfStringHasDuplicatesUnSorted {
	public static void main(String[] args) {

		String A = "helloo";
		boolean flag = false;

		for (int i = 0; i < A.length(); i++) {
			for (int j = 0; j < A.length(); j++) {

				if (A.charAt(i) == A.charAt(j)) {
					flag = true;
					break;
				}

			}

			if (flag == true) {
				break;
			}
		}

		if (flag == true) {
			System.out.println("duplicates found");
		} else {
			System.out.println("No Duplicates");
		}

	}

}
