package oops;

public class Main2 {

	public static void main(String[] args) {
//		 Shapes s=new Shapes();
//		 s.area();
		 
		 Shapes myTriangle=new Triangle();//upcasting
		 
		 Shapes myCircle=new Circle();
		 
		 myTriangle.area();
	}
}
