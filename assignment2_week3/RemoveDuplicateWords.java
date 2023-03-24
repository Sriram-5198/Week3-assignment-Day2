package assignment2_week3;


import java.util.LinkedHashSet;

import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
	    int len = split.length;
	    Set<String> txt=new LinkedHashSet<>();
	    for (int i = 0; i < len; i++) {
			txt.add(split[i]);
		}
       System.out.println(txt);

	}

}
