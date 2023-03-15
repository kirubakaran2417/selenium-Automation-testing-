package methods;

public class AreaCalculation {

	
	int radius=5;
	int height=8,base=9;
	int width=20,length=18;

	
	
	public double circleArea() {
		double area=3.14159*radius*radius;
		return area;
	}
	public double triangleArea() {
		double area=(height*base)/2;
		return area;
	}

	public int rectangleArea() {
		int area=width*length;
		return area;
	}
	
	
	
	
	public static void main(String[] args) {
		AreaCalculation a1=new AreaCalculation();
		AreaCalculation a2=new AreaCalculation();
		System.out.println("-----Circle------");
		a1.radius=10;
		System.out.println("Area of Circle 1: "+a1.circleArea());
		System.out.println("Area of Circle 2: "+a2.circleArea());
		System.out.println("Area of Rectangle 2: "+a2.rectangleArea());
	}
}
}
