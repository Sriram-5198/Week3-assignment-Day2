package assignment2_week3;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[]num= {6,9,1,5,2,4,8,10,7};
		List<Integer> n=new ArrayList<>();
		for (int i = 0; i < num.length; i++) {
			n.add(num[i]);
		}
            Set<Integer> ch=new TreeSet<>(n);
            System.out.println(ch);
             int i =1;
            for (Integer in : ch) {
             
				if (in!=i) {
					System.out.println(i);
					break;
				}
				i=i+1;
             
			}   
			}            
}
        

