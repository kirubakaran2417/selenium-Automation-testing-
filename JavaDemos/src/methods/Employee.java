package methods;

public class Employee {

	public String name;
	public int id;
	
	void printID() {
		System.out.println("Employee ID: "+id);
	}
	
	Employee(String n,int i){
		name =n;
		id=i;
	}
	
	public static void main(String[] args) {
		Employee e=new Employee("kiruba",23);
		e.printID();
	}
}
