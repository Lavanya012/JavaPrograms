package String;

public class ReverseAStringByPreservingThePosition {

	String A = "Hi there hello nik";
	String reverse = "";

	public String reverse() {
		String[] C = A.split("\\s+");

		for (String string : C) {

			for (int i = string.length() - 1; i >= 0; i--) {

				reverse = reverse + string.charAt(i);

			}

			reverse = reverse + " ";

		}

		return reverse;
	}

	public static void main(String[] args) {
		ReverseAStringByPreservingThePosition rs = new ReverseAStringByPreservingThePosition();
		System.out.println(rs.reverse());
	}

}
