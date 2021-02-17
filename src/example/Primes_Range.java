package example;

import java.util.Scanner;

public class Primes_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting number");
		int n=sc.nextInt();
		System.out.println("enter ending number");
		int m=sc.nextInt();
		int flag=1;
		for(int i=n;i<=m;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
				flag=0;
				break;
				}
				else 
				{
					flag=1;
					
				}
		
			}
			if(flag==1)
			{
				System.out.println(i);
			}
		}

	}

}
