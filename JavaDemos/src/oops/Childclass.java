package oops;

public class Childclass extends Parentclass{

	
	public void display() {
		super.num=35;
		super.display();
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
		Childclass c=new Childclass();
		c.display();
	}
}
