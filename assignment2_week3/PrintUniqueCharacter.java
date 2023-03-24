package assignment2_week3;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String s="sriram";
		char[] c = s.toCharArray();
		int len = c.length;
		Set<Character> sr=new LinkedHashSet<>();
		for (int i = 0; i < len; i++) {
		sr.add(c[i]);
		}System.out.println(sr);
		

	}

}
