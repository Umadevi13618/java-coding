package example;

public class Intarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,0,2,3,4,0,0,0,5,6,7,0,8,0,9};
		int count=0;
		int temp;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
	             temp=a[count];
	             a[count]=a[i];
	             a[i]=temp;
	             count=count+1;
				
			}
		}
		
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
	}

}
