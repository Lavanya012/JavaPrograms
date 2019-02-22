package String;

public class CheckIfStringContainsOnlyDigit {

	public static void main(String[] args) {
		String A = "123a";
		
		boolean flag = false;
		char[] arr = A.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			if (Character.isDigit(arr[i])) {
				flag = true;

			}

			else {
				flag = false;
			}

		}

		if (flag == true) {
			System.out.println("all are digits");
		} else {
			System.out.println("all are not digits");
		}

	}

}
