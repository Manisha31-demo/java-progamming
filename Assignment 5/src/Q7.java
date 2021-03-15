import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,sign=1,term=0,sum=0,m=1;
		System.out.println("Enter the range");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
		term=1;
		term=sign*m;
		sum+=term;m+=2;
		sign*=-1;
		}
		System.out.println("The sum is= "+sum);
	}

}
