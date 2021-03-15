import java.util.*;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);double x;
		System.out.println("Enter the value of x in radians");
		x=sc.nextDouble();
		double tsin=x;
		double term=x;
		double error=0.000001;
		int i=1;
		while(Math.abs(term)>error)
		{
		i+=2;
		term=-term*(x*x)/(i*(i-1));
		tsin+=term;
		}
		System.out.println("The value of sin("+x+") = "+tsin);
	}

}
