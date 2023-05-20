package week3.day2assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				//       output= 7;

				/*
				 * Pseudo Code: 
				 * a) Create a empty Set Using TreeSet
				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				 * c) converted Set into List
				 * d) Print the second last element from List
				 * 
				 * 
				 */
				
				Set<Integer> unique = new TreeSet<>();
				for (int i = 0; i < data.length; i++) {
					unique.add(data[i]);
					
				}
				System.out.println(unique);
				
				List<Integer> list = new ArrayList<>(unique);
			
				int size=list.size();
				System.out.println("size of list "  +size);
				int name = list.get(size-2);
				System.out.println("SecondLargest No in the list "  +name);
	}

}
