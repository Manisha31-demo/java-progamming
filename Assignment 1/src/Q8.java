
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 24;
		int B = 12;
		
		System.out.println("Before Swapping");
		System.out.println("Value of A is=" + A);
		System.out.println("Value of B is=" + B);
		
		A = A + B;
		B = A - B;
		A = A - B;
		
		System.out.println("After Swapping");
		System.out.println("Value of A is =" + A);
		System.out.println("Value of B is =" + B);
				
	}

}
