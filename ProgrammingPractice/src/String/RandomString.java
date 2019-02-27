package String;

public class RandomString {
	
	public static void main(String[] args) {
		int min=1;
		int max=10;
		int length=max-min+1;
		String s="ABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJHABCFRESTYUIOPKJH";
		String newString="";
		int random=0;
		while(newString.length()<5)
		{
			 random=(int)(Math.random()*length+1);
			
			newString=newString+s.charAt(random);
		}
		
		System.out.println(random);
		System.out.println(newString);
		
		
	}

}
