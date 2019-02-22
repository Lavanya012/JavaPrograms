package String;

public class __PrintCombinationOfString {

	public static void main(String[] args) {
		String A = "abc";
		int i, j, k;
		String comb="";

		for (i = 0; i < A.length(); i++) {
			comb="";
			
			comb=comb+A.charAt(i);

			for (j = 0; j < A.length(); j++) {
				
				if (A.charAt(i) != A.charAt(j)) {
					comb=comb+A.charAt(j);
				}
				
				for (k = 0; k < A.length(); k++) {
					if (A.charAt(k) != A.charAt(i) && A.charAt(k) != A.charAt(j)) {
						comb=comb+A.charAt(k);
					}

					
				}
			
				System.out.println(comb);
				break;

			}
			
			

			
			
		}
		

	}

}
