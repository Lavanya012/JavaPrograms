package Array.Duplicates;

public class CheckIfanyDuplicateUnSorted {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 2, 3, 4, 6, 7, 8, 7 };
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				
				/* Break inner loop */
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}

			}
			/* Break outer loop */
			if (flag == true) {
				break;

			}

		}

		if (flag == true) {
			System.out.println("It has duplicates");
		} else {
			System.out.println("No duplicate found");
		}

	}

}
