import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers you want to enter");
		int n=sc.nextInt();
		int sum = 0, m;
		for (int i = 0; i <= n; i++)
		 {
		 System.out.println("Enter the number");
		 m=sc.nextInt();
		 sum = sum+m;
		 }
		 double avg = sum/n;
		 System.out.println("The total is"+ sum);
		 System.out.println("The average is"+ avg);
	}

}
