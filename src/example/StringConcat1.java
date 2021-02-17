package example;

public class StringConcat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="123java456";
		String output="";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
			output=output+s.charAt(i);	
			}
		} System.out.println(output);
		
	}

}
