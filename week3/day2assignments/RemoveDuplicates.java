package week3.day2assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "Paypal India";
char[] ch = str.toCharArray();
Set <Character> charset = new LinkedHashSet<>();
Set <Character> dupeset = new LinkedHashSet<>();
for (int i = 0; i < ch.length; i++) {
	if (charset.add(ch[i])) {}
	else
		dupeset.add(ch[i]);
	
}
System.out.println("The unique characters are ");
for(Character c:charset) {
	if(c!=' ')
	System.out.print(c);
}

	}

}
//Declare a String as "PayPal India"

//Convert it into a character array

//Declare a Set as charSet for Character

//Declare a Set as dupCharSet for duplicate Character

//Iterate character array and add it into charSet

//if the character is already in the charSet then, add it to the dupCharSet

//Check the dupCharSet elements and remove those in the charSet

//Iterate using charSet

//Check the iterator variable isn't equals to an empty space

//print it
