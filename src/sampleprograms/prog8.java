package sampleprograms;

import java.util.Scanner;

public class prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			prog8 p8=new prog8();
			Scanner in=new Scanner(System.in);
			String name=in.nextLine();
			p8.cities(name);
	}
	
	
	public void cities(String cityName)
	{
		switch(cityName)
		{
		
		case "Coimbatore":
						{
							System.out.println("Marduhamali");
							break;
						}
		case "Tirchy":
						{
							System.out.println("Malaikottai");
							break;
							}
		case "Chennai":
						{
							System.out.println("Kundrathur");
							break;}
		case "Madurai":	
						{
							System.out.println("Thiruparamkundram");
						}
		case "Tirunelveli":{
							System.out.println("Tiruchendur");
							}
		case "thoothukudi":{
							System.out.println("Tiruchendur");
							}
		default:{
			System.out.println("Not matching cities");
		}
		}
	}
	
	

}
