package sampleprograms;

import java.util.Scanner;

public class evenodd
{
   

public static void main(String args[])
{
	evenodd num=new evenodd();
	num.prog9();
	
}
public void prog9()
{
   Scanner in=new Scanner(System.in);
   int number=in.nextInt();
   if (number%2==0)
   {
	   System.out.println("The number is even");
   }
   else
   {
	   System.out.println("The number is odd");
   }
   
		   	
}

}