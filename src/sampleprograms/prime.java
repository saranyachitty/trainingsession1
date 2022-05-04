package sampleprograms;

import java.util.Scanner;

public class prime 
{
	int start=2;
	

	public static void main(String args[])
	{
		prime p1=new prime();
		p1.numcheck();
		
	}
	public void numcheck()
	{
		Scanner in=new Scanner(System.in);
	    System.out.println("Enter a number");
		int number=in.nextInt();
		
					
			for (int currentnum=2;currentnum<=number/2;currentnum++)
			{
				if(number%currentnum!=0)
				{
				
				System.out.println(currentnum+"is a prime number");
			}
				else
				{
					System.out.println(currentnum+"is not a prime");
				}
			
			
			
		}
	
	}
	public boolean checkprime(int number)
	{
		if(number<=1)
		{
			return false;
		}
		return true;
	}
	
	
	
	
}
