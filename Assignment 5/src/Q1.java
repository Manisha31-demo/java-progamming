import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
		double r=Math.pow(2,i);
		System.out.println("2^"+i+"="+r);
		}
		
	}

}
