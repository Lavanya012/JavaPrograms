package String;

public class LastIndexOfAnycharacter {

	public static void main(String[] args) {
		String A = "IncludeHelp";
		char c = 'e';
		int index = 0;

		char[] arr = A.toCharArray();

		/* Method 1 - using loop*/
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == c) {
				index = i;
			}
		}

		System.out.println(index);
		
		/* method-2- using inbuilt method*/
		
		System.out.println(A.lastIndexOf(c));

	}
}
