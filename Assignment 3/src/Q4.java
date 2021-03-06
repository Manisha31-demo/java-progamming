import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a character");
    c=sc.next().charAt(0);
    if(c>=65 && c<=90)
      System.out.println("The entered character is an uppercase"); 
    else if(c>=97 && c<=122)
     System.out.println("The entered character is a lowercase");
    else if(c>=48 && c<=57)
     System.out.println("It is a digit");
    else if ((c>=0 && c<=47)|| (c>=58 && c<=64) || (c>=91 && c<=96)||(c>=123 && c<=127))
    	System.out.println("It is a special character");
    	
    	
	}

}
