package basics;

import java.io.File;
import java.io.FileInputStream;

public class Eh {
//checked exception
//unchecked exception
	public static void main(String[] args) {
		
		System.out.println("Line 1");
		System.out.println("Line 2");
		System.out.println("Line 3");
		System.out.println("Line 4");
		try {
			System.out.println(5/5);
			int[] arr= {1,2,3,4};
			System.out.println(arr[5]);
		}catch(ArithmeticException e) {
			System.out.println("we cant divide any number by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}
		System.out.println("Line 5");
		System.out.println("Line 6");
		System.out.println("Line 7");

		
	}
}
