package methods;

public class Student {

	//properties
	int rollno;
	String name;
	int age;
	
	//actions
	public void reading() {
		System.out.println(name+" is reading");
	}
	public void playing() {
		System.out.println(name+" is playing");
	}
	public void ageVerification() {
		System.out.println(rollno+" is "+age+" years old");
	}
}
