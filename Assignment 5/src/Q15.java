import java.util.Scanner;
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount (e.g., 100): ");
		double amount = input.nextDouble();
		System.out.print("Enter the annual interest rate (e.g., 5): ");
		double annualInterestRate = input.nextDouble();
		System.out.print("Enter the number of months (e.g., 6): ");
		int months = input.nextInt();
		double monthlyInterestRate = annualInterestRate / 1200;
		double compoundValue = 0; // Accumulates compount value
		for (int m = 1; m <= months; m++) 
		{
		compoundValue = (amount + compoundValue) * (1 + monthlyInterestRate);
		}
		System.out.println("Amount in savings account after " + months + " months" + 
		compoundValue);

	}

}
