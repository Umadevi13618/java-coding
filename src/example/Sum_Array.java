package example;

import java.util.Scanner;

public class Sum_Array {
	
	public int summ(int a[])
	{
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of array");	
	
		Scanner sc=new Scanner(System.in);
	int length=sc.nextInt();
	int a[]=new int[length];
	System.out.println("enter elements");
	
	for(int i=0;i<a.length;i++)
	{
	 a[i]=sc.nextInt();
	}
		Sum_Array ar=new Sum_Array();
		ar.summ(a);
		
		int total=ar.summ(a);
		System.out.println(total);

	}

}
