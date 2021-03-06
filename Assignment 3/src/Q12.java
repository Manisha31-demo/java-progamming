import java.util.Scanner;
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter three integers");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int max=Math.max(a,Math.max(b,c));
		int min=Math.min(a,Math.min(b,c));
		int median=(a+b+c)-max-min;
		System.out.println(min+" " +median+ " " +max);

	}

}
