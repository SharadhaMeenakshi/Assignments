package day1.assignments;

import java.util.Iterator;

public class IsPrime
{
public static void main(String[] args) 
{
int n=11;
boolean isPrime=true;

	for (int i = 2; i <n; i++) 
	{
		if(n%i==0) 
		{
		isPrime=false;
	    }
	}
	if(isPrime)
	System.out.println("The number  "+n+"  is a primenumber");
	else
	System.out.println("The number  "+n+"  is not a primenumber");
}
}
