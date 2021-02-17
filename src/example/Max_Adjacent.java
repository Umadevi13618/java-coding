package example;

import java.util.Scanner;

public class Max_Adjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("entger size of the array");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		
		int a[]=new int[length];
		System.out.println("enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//System.out.println(a);
	Max_Adjacent m=new Max_Adjacent();
	m.Max_Diff_Adjacent(a);
}
	
	public void Max_Diff_Adjacent(int a[])
	{ 
		int max;
		for(int i=0;i<a.length;i++)
		{
	max=a[i]-a[i++];	
		System.out.println(max);
				
			}
		}
	
}