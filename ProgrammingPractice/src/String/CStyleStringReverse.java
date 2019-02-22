package String;

public class CStyleStringReverse {
	public static void main(String args[]){
		String s = "this is a demo test!";
		System.out.println(reverse(s));
	}
	
	public static String reverse(String input){
		char[] data = input.toCharArray();
		int i = 0;
		int j = data.length - 1;
		char temp;
		
		while(i < j){
			temp = data[i];
			data[i] = data[j];
			data[j] = temp;
			i++;
			j--;
		}
		
		String s = new String(data);
		return s;
	}
}