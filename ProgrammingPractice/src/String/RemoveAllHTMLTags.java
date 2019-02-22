package String;

public class RemoveAllHTMLTags {
	
	public static void main(String[] args) {
		
		String A="<title>How to remove html tags from a string? - Java String Programs</title>";
		
		//This will remove everything between <>.
		//. means any single character
		// * means everything
		// ? means shortest match.If we don't add ? here the it will include "title>How to remove html tags from a string? - Java String Programs</title"
		System.out.println(A.replaceAll("<.*?>", ""));
		
		
		
		
	}

}
