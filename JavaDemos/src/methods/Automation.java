package methods;

public class Automation {

	String name;
	String age;
	public Automation() {
		
	}
	private Automation(String name,String age) {
		this.name=name;
		this.age=age;
	}
	public void displayName() {
		System.out.println("My name is: "+name);
	}
	
	public void displayAge() {
		System.out.println("My age is: "+age);
	}
	
}
