package sampleprograms;



interface Draw{
	
	 void shape();
	
	void shape(int size); 
}

class shapeOne implements Draw{
	public void shape() {
		System.out.println("Thtis is to Draw rectangle");
	}
	
	public void shape(int size) {
		System.out.println("Thtis is to Draw circle "+size);
	}

}
class shapeTwo implements Draw{
	public void shape() {
		System.out.println("Thtis is to Draw hexagon");
	}
	
	public void shape(int size) {
		System.out.println("Thtis is to Draw triangle "+size);
	}

}
class interTtry {
public static void main(String args[]) {

	 Draw diagram1=new shapeOne();
	 Draw diagram2=new shapeTwo();
	 diagram1.shape();
	 diagram2.shape();
	 diagram1.shape(10);
	 diagram2.shape(0);
}
}
