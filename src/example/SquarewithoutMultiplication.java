package example;

import java.util.Scanner;

public class SquarewithoutMultiplication {
	
	public static void main(String[] args) {

	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	n=s.nextInt();
	SquarewithoutMultiplication ob=new SquarewithoutMultiplication();
	ob.Square(n);
	}
	
	 public void Square(int val)
	{
	    int valSqr = val;

	    for (int i = 0; i < val-1; i++){
	        valSqr=valSqr+val;
	    }
	   System.out.println(valSqr);
	}	

}