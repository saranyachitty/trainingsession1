package sampleprograms;

import java.util.Scanner;

public class primerange
{

	public static void main(String args[])
	{
		System.out.println("Enter max number");
		Scanner in=new Scanner(System.in);
		int maxnumber=in.nextInt();
		
		for(int num=2;num<=maxnumber;num++)
		{
			boolean prime=true;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					prime=false;
					break;
				}
			}
			if(prime==true)
				System.out.println(num);
		}
	}
}
