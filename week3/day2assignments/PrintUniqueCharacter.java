package week3.day2assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*a) Convert String to Character array
	 * b) Create a new Set -> HashSet
	 * c) Add each character to the Set and if it is already there, remove it
	 * d) Finally, print the set
	 * 
	 */
		String str = "Sharadha";
		char[] ch = str.toCharArray();
		Set<Character> uniquechar = new HashSet<>();
		for(int i =0 ; i< ch.length;i++ ) {
			uniquechar.add(ch[i]);
	}
		System.out.println(uniquechar);
}
}