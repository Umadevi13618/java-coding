package example;

import java.util.Arrays;

public class Array2D {
	public static void main(String[] args) {
		int a[][]={{1,2},{2,4},{3,1},{5,1}};
		int sum;
		System.out.println(a.length);
		//System.out.println(a[i].length);
		for (int i=0;i<a.length;i++) 
		{
		sum = 0;
		System.out.println(a[i].length);
		
		     for (int j=0;j<a[i].length;j++) 
		      {
		         sum = sum + a[i][j];
		      }
		      if (sum == 6)
		      {
		       System.out.println(Arrays.toString(a[i]));
		       }
		}
		}

}
