package basics;

import java.util.Scanner;

public class AcceptingInputfromuser {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		
		System.out.println("The sum of a and b is "+(a+b));
	}
}
