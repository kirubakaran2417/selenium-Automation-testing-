package methods;

public class StaticDemo {

	static int a=25;

	int a1=7;
	int b=35;
	
	
	public static int display() {
		int b =a+5;
	//	System.out.println(this.b); //this cant be applied
		return b;
	}
	
	public void display2() {
		System.out.println(a1);
		System.out.println(b);
		System.out.println("chennai is so hot");
	}
	public static void main(String[] args) {
		StaticDemo s=new StaticDemo();
		System.out.println(s.b);//non static variable
		s.display2();//non static method
		System.out.println(a);//static variable	
		display();
	}
}
