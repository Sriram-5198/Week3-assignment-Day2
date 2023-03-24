package assignment2_week3;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		String[] cr= {" HCL", " Wipro", "  Aspire Systems", " CTS"};
		String rev = "";
		int len = cr.length;
		Arrays.parallelSort(cr);//[  Aspire Systems,  CTS,  HCL,  Wipro]

		for (int i = len-1; i>=0; i--) {
			
			rev=rev+cr[i];
		
			
		}
		System.out.println(rev);
		
		
    }
}
		
	

