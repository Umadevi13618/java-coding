package example;

public class OccurenceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java programming language";
		int length=s.length();
		System.out.println(length);
		String str=s.replaceAll("i","");
		System.out.println(str);
		int len=str.length();
		int total=length-len;
		System.out.println(total);
	}

}
