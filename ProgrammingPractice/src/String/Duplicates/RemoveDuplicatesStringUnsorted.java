package String.Duplicates;

public class RemoveDuplicatesStringUnsorted {

	public static void main(String[] args) {
		String A="hellloooh";
		String B="";
	 boolean flag=false;
		
		for(int i=0;i<A.length();i++)
		{
			flag=false;
			for(int j=i+1;j<A.length();j++)
			{
			
				if(A.charAt(i)==A.charAt(j))
				{
					flag=true;
					break;
				}
				
			}
			if(flag==false)
			{
				B=B+A.charAt(i);
			}
		}
		
		System.out.println(B);

	}

}
