import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,n,fact=1;
		System.out.println("Enter the value of x");
		x=sc.nextInt();
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		fact*=n;
		}
		double term=((Math.pow(x, n))/n);
		System.out.println(term);
		}
	}


