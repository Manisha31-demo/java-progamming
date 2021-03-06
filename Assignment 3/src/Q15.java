import java.util.Scanner;
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input=new Scanner(System.in);
      System.out.print("Enter a point with two coordinates: ");
      double x=input.nextDouble();
      double y=input.nextDouble();
      double distance=Math.pow(Math.pow(x,2) + Math.pow(y,2),0.5);
      if (distance<=10)
    	  System.out.println("Point lies in the circle");
      else
    	  System.out.println("Point does not lie in the circle");
      
	}

}
