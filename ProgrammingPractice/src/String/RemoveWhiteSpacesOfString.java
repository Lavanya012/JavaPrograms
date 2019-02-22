package String;

public class RemoveWhiteSpacesOfString {
	
	
	public static void main(String[] args) {
		
		String A="abc bcd der";
		
		System.out.println(A.replaceAll("\\s+", ""));
		
	}

}
