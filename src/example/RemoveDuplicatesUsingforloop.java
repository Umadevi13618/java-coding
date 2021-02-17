package example;

public class RemoveDuplicatesUsingforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,3,2,4,5,3,5,6,3,7,9};
		for(int i=0;i<arr.length;i++)
		{    int count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]!=arr[j])
				{
					System.out.println(arr[j]);
		
				}
				
			}
		
		}

	}
}

