import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     String msg;
	     msg=sc.next();
	     int i=1;
	     while(i<=10);
	     {
	    	 if(i==1)
	    		 System.out.println(i+"st"+msg);
	    	 else if(i==2)
	    		 System.out.println(i+"nd"+msg);
	    	 else if(i==3)
	    		 System.out.println(i+"rd"+msg);
	    	 else
	    		 System.out.println(i+"th"+msg);
	    	 i++;
     }
     
	}

}
