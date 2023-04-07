package oops;

public class Chennai extends Delhi{

	@Override
	public void idVerification() {
		System.out.println("driving license");
		
	}

}
class Bangalore extends Delhi{

	@Override
	public void idVerification() {
		System.out.println("Adhaar");
		
	}
	
}