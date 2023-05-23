package javaConcepts;

public class GetSetData {

	public static void main(String[] args) {
		
		EncapsPractice encaps = new EncapsPractice();
		
		encaps.setName("Bhushan");
		String customerFirstName= encaps.getName();
		System.out.println(customerFirstName);
		
		encaps.setAge(28);
		int customerAge= encaps.getAge();
		System.out.println(customerAge);
		
		encaps.setOrderID(12345);
		int customerOrderID =encaps.getOrderID();
		System.out.println(customerOrderID);
		

	}

}
