package week3.day2assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String array[]= {"Google","Microsoft","TestLeaf","Maverick"};
		List<String> company = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			company.add(array[i]);
		}
		Collections.sort(company);
		for (int i = company.size() -1; i>= 0; i--) {
			
			System.out.println(company.get(i));
		}
		
	}

}
//TODO Auto-generated method stub
		// Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)		
		// get the length of the array		
		// sort the array			
		// Iterate it in the reverse order
		// print the array
		// Required Output: TestLeaf, Microsoft, Maverick, Google