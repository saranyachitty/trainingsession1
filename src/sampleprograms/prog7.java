package sampleprograms;

import java.util.Scanner;

public class prog7 {
	
	int start=0;
	int mid=0;
	int sum=1;
	public static void main(String args[])
	{
		prog7 p1=new prog7();
		p1.fibonaciSeries();
	}
	
	public void fibonaciSeries() {
		Scanner in=new Scanner(System.in);
		//System.out.println("maximum times");
		//int max=in.nextInt();
		System.out.println("finaonci times");
		int num=in.nextInt();
		if(zeroCheck(num) && num<=99)
		{
			System.out.println("Start Finobaci");
			for(int currentnum=0;currentnum<num;currentnum++){
				start=mid;
				mid=sum;
				sum=start+mid;
				System.out.println(start+",");
			}
			
			
		}else
		{
			System.out.println("Given value doesn't suit for above 0 and less than 100");
		}
		//System.out.println(num);
		
	}
	public boolean zeroCheck(int a)
	{
		if(a>0)
			return true;
		else 
			return false;
	}
	
	
}
