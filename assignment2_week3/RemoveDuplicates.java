package assignment2_week3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String sr="PayPal India";
		char[] cr = sr.toCharArray();
		
		Set<Character> charSet=new LinkedHashSet<>();
		Set<Character> dupCharSet=new LinkedHashSet<>();
		
		for(char cc:cr)
		{
			boolean flag = charSet.add(cc);
			if(!flag)
			{
				dupCharSet.add(cc);
			}
			
		}
		
		System.out.println("Unique Characters are : " + charSet);
		System.out.println("Duplicate Characters are : "+ dupCharSet);
		
		charSet.removeAll(dupCharSet);
		System.out.println("after removing duplicate characters : " + charSet);
		
		Set<Character> newset = new LinkedHashSet<Character>();
		
		for(char cc:charSet) {
			
			if(cc !=' ')
			{
				newset.add(cc);
			}
					}
		System.out.println(newset);
	}
	
}

