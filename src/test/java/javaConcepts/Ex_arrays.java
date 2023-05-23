package javaConcepts;

public class Ex_arrays {

	public static void main(String[] args) {
		
		int[] arry = {10,20,30,40};
		int sum = 0;
		
		int sum1 = 0;
		for (int i=0;i<arry.length;i++) {
			sum1 = sum1 + arry[i];
			//System.out.println(sum);
		}
		System.out.println(sum1);
		
		System.out.println("--------------------");
		for (int num:arry) {
			sum = sum + num;
		}
		System.out.println(sum);
	}

}
