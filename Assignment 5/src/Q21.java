import java.util.*;
public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		System.out.println("Enter the second number");
		int y=sc.nextInt();
		while(y>0)
		{
		int rem=x%y;
		x=y;
		y=rem;
		}
		System.out.println("GCD = "+x);
	}

}
