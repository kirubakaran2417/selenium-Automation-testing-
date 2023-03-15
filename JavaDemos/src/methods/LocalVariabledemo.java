package methods;

public class LocalVariabledemo {

	int a=25;
	
	public int demo() {
		int a=27;
		System.out.println(this.a);
		return a;
	}
	

	public static void main(String[] args) {
		
		LocalVariabledemo l=new LocalVariabledemo();
		l.demo();
	}
}
