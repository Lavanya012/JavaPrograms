package PracticeTest;

public class SwapTwoVariable {
	
	public static void main(String[] args) {
		
		String A="abc";
		String b= "bcd";
		
		A=A+b;
		
		System.out.println(A);
		
		b=A.substring(0,b.length());
		System.out.println(b);
		
		A=A.substring(b.length(), A.length());
		
		System.out.println(A);
	
	}

}
