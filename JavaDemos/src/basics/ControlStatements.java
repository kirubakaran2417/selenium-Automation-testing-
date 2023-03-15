package basics;

public class ControlStatements {

	public static void main(String[] args) {
		
	int a=5;
	int b=8;
	int c=6;
	if(a>=b && a>=c) {
		System.out.println("a is bigger");
	
	}else if(b>=a && b>=c) {
		System.out.println("b is bigger");
	}else  {
		System.out.println("c is bigger");
	}
	}
}
