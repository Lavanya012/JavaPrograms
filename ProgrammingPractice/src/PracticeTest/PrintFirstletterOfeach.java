package PracticeTest;

public class PrintFirstletterOfeach {
	
	public static void main(String[] args) {
		String A="hello there hi";
		
		String[] arr=A.split("\\s+");
		String firstletter="";

		
		for(String ar:arr)
		{
			
			firstletter=firstletter+ar.charAt(0);
		}
		
		System.out.println(firstletter);
		
	}

}
