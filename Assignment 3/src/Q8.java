import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int rahul,ayush,ajay;
      System.out.println("Enter the ages of Rahul,Ayush,Ajay respectively");
      rahul=sc.nextInt();
      ayush=sc.nextInt();
      ajay=sc.nextInt();
      if(rahul<ayush&&rahul<ajay)
    	  System.out.println("Youngest is Rahul");
      else if(ayush<rahul&&ayush<ajay)
    	  System.out.println("The youngest is Ayush");
      else
    	  System.out.println("The youngest is Ajay");
      
	}

}
