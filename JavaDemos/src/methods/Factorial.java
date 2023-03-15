package methods;

public class Factorial {

	
	public int findfactorial() {//declaring method to find factorial
		//which is returning integer
		
		int number =5;
		int answer=1;
		for (int i=2;i<=number;i++) {
			answer*=i;
		}
		return answer;
			
	}
	
	public static void main(String[] args) {
		Factorial f=new Factorial();
		int ans=f.findfactorial();
		System.out.println(ans);

	}
}
