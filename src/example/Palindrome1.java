package example;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int rev,temp;
		int sum=0;
		System.out.println(n);
		temp=n;
		while(n>0)
		{
			//424
			rev=n%10;
			sum=(sum*10)+rev;
			n=n/10;
		}
		//System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("palindrome number" + temp);
		}
	}

}
