package day2.assignments;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		String rstr = "";
		int length =str.length();
		 
		for (int i=length-1; i>=0; i--)
	      {
	       char c= str.charAt(i); 
	        rstr= rstr+c; 
	      }
		if (str.equalsIgnoreCase(rstr))
		{
			
			System.out.println("Palindrome: "+ rstr);
			
	}
		else 
			System.out.println("Not a palindrome");
	}}
