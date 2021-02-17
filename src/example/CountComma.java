package example;

public class CountComma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="testcase,,,,,passed";
		int len=str.length();
		System.out.println(len);
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		int length=str.length();
		System.out.println(len-length);
	}  

}
