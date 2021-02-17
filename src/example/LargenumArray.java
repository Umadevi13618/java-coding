package example;

public class LargenumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,2,8,3,9,7};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
