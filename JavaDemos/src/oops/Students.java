package oops;

public class Students {
	/*
	 * variables
	 */
	String name;
	String college;
	/*
	 * constructor
	 */
	public Students(String name, String college) {
		this.name = name;
		this.college = college;
	}
	/*
	 * methods
	 */
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public static void main(String[] args) {
		Students s1;
		s1=new Students("kiruba","desc");//reference variable
	}
}
