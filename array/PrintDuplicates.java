package array;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		int dup = num [0];
		
		Arrays.sort(num);
		for (int i = 1; i< num.length-1;i++) {
			if  (num[i]== dup) {
				System.out.println("duplicate values "+num [i]);
			}
			
			else
				dup=num[i];
			
		}
		
	}

}
