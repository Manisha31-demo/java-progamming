import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		for (int i=100; i<=1000; i++)
		{
		if (i % 5 ==0 && i % 6 ==0)count++;
		if (count % 11 ==0)
		System.out.println();
		else
		System.out.print(i + " ");
		}
	}

}
