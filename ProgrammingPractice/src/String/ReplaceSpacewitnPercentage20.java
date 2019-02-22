package String;

public class ReplaceSpacewitnPercentage20 {
	
	public static void main(String[] args) {
		
		String A="hello hi";
		
		/*Method 1-Replace all method*/
		//System.out.println(A.replaceAll("\\s+", "%20"));
		
		
		/*Method 2- Using String builder*/

	        char arr[] = A.toCharArray();    
	        StringBuilder sb= new StringBuilder();
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == ' ')
	            sb.append("%20");
	            else
	                sb.append(arr[i]);

	        }

	        System.out.println(sb.toString());
	    }
		
	}


