package sampleprograms;

public interface routinefood 
{
  void breakfast();
  void juice();
  void lunch();
  void snacks();
  void dinner();
}

class saranya implements routinefood
{
public void breakfast() 
{
	System.out.println("Idly with sambar");
}
public void juice()
{
	System.out.println("watermelon");
}
public void lunch() {
	System.out.println("meals");
}
public void snacks() {
	System.out.println("Sandwich");
}
public void dinner() {
	System.out.println("Chapathi with curry");
}
}

class ownhouse implements routinefood{
	
	public void breakfast() 
	{
		System.out.println("venpongal with sambar");
	}
	public void juice()
	{
		System.out.println("Lemon");
	}
	public void lunch() {
		System.out.println("full meals");
	}
	public void snacks() {
		System.out.println("vada");
	}
	public void dinner() {
		System.out.println("Idly with chutney");
	}
}

class inlawhouse implements routinefood{
	public void breakfast() 
	{
		System.out.println("Fruits");
	}
	public void juice()
	{
		System.out.println("coconutmilk");
	}
	public void lunch() {
		System.out.println("millet meals");
	}
	public void snacks() {
		System.out.println("Sundal");
	}
	public void dinner() {
		System.out.println("Fruits");
	}
}

class interwork{
	public static void main(String args[])
	{
	  routinefood r1=new saranya();
	  routinefood r2=new ownhouse();
	  routinefood r3=new inlawhouse();
	  r1.breakfast();
	  r1.juice();
	  r1.lunch();
	  r1.snacks();
	  r1.dinner();
	  r2.breakfast();
	  r2.juice();
	  r2.lunch();
	  r2.snacks();
	  r2.dinner();
	  r3.breakfast();
	  r3.juice();
	  r3.lunch();
	  r3.snacks();
	  r3.dinner();
	  
	}
}
	
	
	
	
	
	
	
	

