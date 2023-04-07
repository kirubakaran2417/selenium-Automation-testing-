package methods;

public class Parametersdemo {

	public void add(int a,int b) {//parameters
		System.out.println(a+b);
	}
	public void sub(int a,int b) {
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		Parametersdemo pd=new Parametersdemo();
		pd.add(23, 32);
		pd.sub(33, 10);//arguments
	}
}
