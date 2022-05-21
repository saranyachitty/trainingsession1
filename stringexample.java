package pages;

import java.util.Scanner;

public class stringexample
{
   
public static void main(String args[])
   {
	   //uppercase
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the string to be converted: ");
	   String str=sc.nextLine();
	   str=str.toUpperCase();
	   System.out.println(str);
	   
	   //lowercase
	   Scanner sc1=new Scanner(System.in);
	   System.out.println("Enter the string to be converted: ");
	   String str1=sc.nextLine();
	   str1=str1.toLowerCase();
	   System.out.println(str1);
	   
	   //adding integers
	   Scanner sc2=new Scanner(System.in);
	   System.out.println("Enter the first value: ");
	   String first=sc2.nextLine();
	   int num1;
	   num1=Integer.parseInt(first);
	   
	   Scanner sc3=new Scanner(System.in);
	   System.out.println("Enter the second value: ");
	   String second=sc3.nextLine();
	   int num2;
	   num2=Integer.parseInt(second);
	   //int num1=100;
	   //int num2=200;
	   //String s1=String.valueOf(num1);
	   //String s2=String.valueOf(num2);
	   System.out.println("Result is: "+(num1+num2));
	   
	   //adding string
	   Scanner sc4=new Scanner(System.in);
	   System.out.println("Enter the first value: ");
	   int number3=sc4.nextInt();
	   String third;
	   third=String.valueOf(number3);
	   
	   Scanner sc5=new Scanner(System.in);
	   System.out.println("Enter the second value: ");
	   int number4=sc5.nextInt();
	   String fourth;
	   fourth=String.valueOf(number4);
	   
	   System.out.println("Result is: "+(third+fourth));
	   
	  //String s3="100";
	   //String s4="200";
	   //int num3=Integer.parseInt(s3);
	   //int num4=Integer.parseInt(s4);
	   //System.out.println("Result is: "+(num3+num4));
   
  
   }
   
}
