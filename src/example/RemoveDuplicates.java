package example;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=new String("hello");
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
			     ch[j]=0;
			     
				}
			}
		}
		for(int k=0;k<ch.length;k++)
		{
			if(ch[k]!=0)
		System.out.println(ch[k]);
		}
		
	}
		
}	
		