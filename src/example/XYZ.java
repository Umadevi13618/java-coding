package example;

public class XYZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//only for  sorted array

		int a[]= {1,2,2,3,4,5,5,5,5,};
		int j=0;
	
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j]=a[i];
				j++;
			}
	}
	a[j]=a[a.length-1];
	for(int k=0;k<j+1;k++)
	{
		System.out.println(a[k]);
	
	}
}
}