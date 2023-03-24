package assignment2_week3;


import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> unique=new TreeSet<>();
		for (Integer i : data) {
			unique.add(i);
		}
		//System.out.println(unique);
		List<Integer> i=new ArrayList<>(unique);
		int size = i.size();
		//System.out.println(size);
		System.out.println(i.get(size-2));
		

	}
}
