package oops;
//method overloading
//polymorphism
public class Calculation {

	int sum;
	public int add(int a,int b) {
		sum=a+b;
		return sum;
	}
	public int add(int a,int b,int c) {
		sum=a+b+c;
		return sum;
	}
	public int add(int a,int b,int c,int d) {
		sum=a+b+c+d;
		return sum;
	}
	public static void main(String[] args) {
		Calculation c=new Calculation();
		System.out.println("Addition of 2 digits "+c.add(20, 34));
		System.out.println("Addition of 3 digits "+c.add(54, 65, 76));
		System.out.println("Addition of 4 digits "+c.add(34,45,56, 67));
	}
}

