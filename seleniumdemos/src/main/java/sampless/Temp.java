package sampless;


public class Temp {

	public static void main(String[] args) {
		
		int a=24;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("give any other number to divide instead of zero");
		}finally {
			System.out.println("i will run always");
		}
	}
}
