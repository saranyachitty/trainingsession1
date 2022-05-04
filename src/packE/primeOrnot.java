package packE;

import java.util.Scanner;

public class primeOrnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeOrnot p=new primeOrnot();
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		p.findPrime(a);
	}
	
	public void findPrime(int number) {
		
		// 1,2,3,5,7,11,13,17,19,23
		boolean abc=false;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				abc=true;
				System.out.println("Number is not prime");
				break;
			}
		}
		if(!abc)
			System.out.println("Number is prime");
	}

}
