package day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
	
		String str = "I am a software tester";
		
		String[] S =str.split(" ");
	
		for (int i = 0; i < S.length; i++) 
		{
			
			if(i%2!=0) 
			{			
			char[] ch= S[i].toCharArray();
			String rev="";
			
			for (int j = ch.length-1; j>=0; j--) {
				rev=rev+ch[j];			
			}
			System.out.print(rev+ " ");
			}
			else {
				System.out.print(S[i]+ " ");
			}
		}
	}}

