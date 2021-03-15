import java.util.Scanner;
public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		int index = 2; 
		while (number / index != 1) 
		{
		if (number % index == 0) 
		{
		System.out.print(index + ", ");
		number /= index; 
		}
		else
		index++; 
		}
		System.out.println(number + ".");

	}

}
