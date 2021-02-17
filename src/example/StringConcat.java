package example;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="123java45";
		String output="";
		int j=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				output=output+str.charAt(i);
				System.out.println(output);
			}
			else {
				j=j+Integer.parseInt(output);
				output="0";
				System.out.println(j);
				
			}
		}
		System.out.println(j+Integer.parseInt(output));
     
	}

}
