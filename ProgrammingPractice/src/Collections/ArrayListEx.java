package Collections;

import java.util.ArrayList;
import java.util.List;



public class ArrayListEx {

	
	public static void main(String[] args) {
		
		List<Integer> ls= new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(20);
		for(int val:ls)
		{
			System.out.println(val);
		}
		
		ls.remove("10");
		System.out.println("Removed index 1");
		
		for(int val:ls)
		{
			System.out.println(val);
		}
	}
}
