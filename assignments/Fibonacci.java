package day1.assignments;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNo=0;
		int secondNo=1;
		int sum=0;
		System.out.println("Fibonacci: "+firstNo+"");
		System.out.println(secondNo);
		for (int i = 0; i < 11; i++) {
			sum=firstNo+secondNo;
			System.out.println(sum);
			firstNo=secondNo;
			secondNo=sum;
			
			
		}
		

	}

}
