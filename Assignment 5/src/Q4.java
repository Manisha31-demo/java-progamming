import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number (input ends if it is 0");
		int n=sc.nextInt();
		int sum = 0, c=0, pos=0, neg=0;
		if ( n ==0)
		{
		System.out.println("No number are entered except 0");
		}
		else
		{
		while (n !=0)
		 {
		 c++;
		 sum = sum+n;
		 if (n>0)
		 pos++;
		 else neg++;
		 System.out.println("Enter the number (input ends if it is 0");
		 n=sc.nextInt();
		 }
		 double avg = sum/c;
		 System.out.println("The number of positives is"+ pos);
		 System.out.println("The number of negatives is"+neg);
		 System.out.println("The total is"+ sum);
		 System.out.println("The average is"+ avg);
		}
	}

}
