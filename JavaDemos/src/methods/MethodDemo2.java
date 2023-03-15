package methods;

public class MethodDemo2 {
	
	 public double areaofcircle() {
		  int r=6;
		  float pi=3.142f;
		  double circlearea=pi*r*2;
		  return circlearea;
		 }
		 public float areaoftriangle() {
		  int h=3;
		  int b=2;
		  float trianglearea=(h*b)/2;
		  return trianglearea;
		 }
		 public int areaofrectangle() {
		  int w=8;
		  int l=5;
		  int rectanglearea=w*l;
		  return rectanglearea;
		  
		 }
		 public static void main(String[] args) {
		  MethodDemo2 m=new MethodDemo2(); 
		  double circlearea=m.areaofcircle();
		  System.out.println("Area of circle :" + circlearea);
		  float trianglearea=m.areaoftriangle();
		  System.out.println("Area of triangle:"+trianglearea);
		  int rectanglearea=m.areaofrectangle();
		  System.out.println("Area of rectangle:"+rectanglearea);
		  
		   }
		}

