package example;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number for multiplication table");
	String s=sc.nextLine();
int n=Integer.parseInt(s);
		int count=0;
		for(int i=1;i<=10;i++)
		{
			count=count+n;
			System.out.println(n+"*"+i+"=" +count);

		}
		

	}


}
