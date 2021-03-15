import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i,fact=1;
		System.out.println("enter the no whose factorial u want to find");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
		fact*=i;
		}
		System.out.println("Factorial of "+n+ " is = "+fact);
	}

}
