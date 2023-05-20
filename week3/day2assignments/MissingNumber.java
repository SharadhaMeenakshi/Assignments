package week3.day2assignments;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int num[]= {2,3,4,7,8,9};
		 
		 Set<Integer> number = new TreeSet<Integer>();
		 for (int i = 0; i < num.length; i++) {
			number.add(num[i]);
			
		}
		 System.out.println("Present number" +number);
		 
		 
		 for (int i = 1; i <=10; i++) {
			if(!number.contains(i)) {
				System.out.println("Missing number " +i);
			}
			
					
		}
		 }
				 
	

}
/*
 * Problem 
 * 
 * There will be running number between 1 to 10
 * One of the unique number will be missing
 * Find the missing number
 * 
 * 
 */

/*
 * Psuedocode
 * 
 * a) Remove the duplicates using Set
 * b) Make sure the set is in the ascending order
 * c) Iterate from the starting number and verify the next number is + 1
 * d) If did not match, that is the number
 * 
 */