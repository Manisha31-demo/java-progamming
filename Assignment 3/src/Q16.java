import java.util.Scanner;
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the marks of a student out of 100 full mark");
      int mark=sc.nextInt();
      switch(mark/10)
      {
      case 0:case 1:case 2:case 3:
    	  System.out.println("F");
      case 4:
    	  System.out.println("E");
      case 5:
    	  System.out.println("D");
      case 6:
    	  System.out.println("C");
      case 7:
    	  System.out.println("B");
      case 8:
    	  System.out.println("A");
      case 9:
    	  System.out.println("O");
     default:
    	 System.out.println("Invalid Input");
      }
	}

}
