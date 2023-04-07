package oops;

public class Demo extends ABC{

	public void disp() {
		System.out.println("disp() of child class");
	}
	
	public void newMethod() {
		System.out.println("new method of child class");
	}
	
	public static void main(String[] args) {
		/*
		 * when parent class reference refers to parent class object
		 * then in this case the method of parent class will be called
		 */
		ABC obj=new ABC();
		obj.disp();
		/*
		 * when parent class reference refers to child class object
		 * then your child class method will be called
		 */
		ABC obj2=new Demo();
		obj2.disp();
		System.out.println(obj2.a);
	}
}
