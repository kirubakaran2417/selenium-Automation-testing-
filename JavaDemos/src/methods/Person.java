package methods;

public class Person {

	String name;
	int age;
	String address;
	
	public Person(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	void display() {
		System.out.println(name+" "+age+" "+address);
	}

}
