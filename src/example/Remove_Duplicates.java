package example;

public class Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My name is Rahul but my last name is Kumar";
		String[] s=str.split(" ");
		System.out.println(s.length);
		for(int i=0;i<s.length;i++)
		{
			
		    if(s!=null) {
		
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					s[j]=null;
				}
			}
		}
	
		}
		for(int k=0;k<s.length;k++)
		{
			if(s[k]!=null)
			{
				System.out.println(s[k]);
			}
		}
		
	
	}
}
