package sampleprograms;

public class prog1 extends prog2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Output of samples");
		prog1 obj=new prog1();
		prog2 obj1=new prog2();
		prog2 obj2=new prog1();
	
		obj2.sample();
		obj2.sample("saranaya");
		
		obj.sample("saranya", "Tirhcy");

		
	}

	public void sample()
	{
		System.out.println("Output of samples");
	
	}
	
	public void sample(String abc)
	{
		System.out.println(abc+" is printed");
	}
	
	
}
