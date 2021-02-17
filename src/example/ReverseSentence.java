package example;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is umadevi";
		String[] s=str.split(" ");
		//String s1=new String();
		String s1="";
		System.out.println(s1);
		for(int i=s.length-1;i>=0;i--)
		{
			s1=s1+s[i]+" ";
		}
		System.out.println(s1);
	}

}
