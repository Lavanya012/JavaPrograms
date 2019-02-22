package String;

/**
  a) If the current element in array say arr[i] is smaller than first. Then
  update first and second as, second = first first = arr[i] 
  b) If the current element is in between first and second, then update second to store the value
  of current variable as second = arr[i]
 */

public class SecondSmallestWordOfAString {

	public static void main(String[] args) {

		String A = "there hretr te test";
		String[] words = A.split("\\s+");
		String s = words[0];
		int slength,sslength;
		 slength = sslength=Integer.MAX_VALUE;
		String ss = "";
		

		for (int i = 1; i < words.length; i++) {

			if (slength > words[i].length()) {
				ss = s;
				sslength = slength;
				slength = words[i].length();
				s = words[i];
			}

			if (words[i].length() < sslength && words[i].length() > slength) {
				ss = words[i];
				sslength = words[i].length();
			}

		}

		System.out.println(ss);

	}

}
