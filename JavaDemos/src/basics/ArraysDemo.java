package basics;

public class ArraysDemo {

	public static void main(String[] args) {
		//array is a collection of similar types of data
		//datatype[] arrayname
		//declaring array
		int[] data=new int[5];
		data[0]=23;
		data[1]=34;
		data[2]=45;
		data[3]=56;
		data[4]=67;
		
		int[] data2= {35,45,55,65,75};
		data2[3]=78;

		for (int i = 0; i < data2.length; i++) {
			System.out.println(data2[i]);

		}
	//	System.out.println(data2[3]);
		
		
	}
}
