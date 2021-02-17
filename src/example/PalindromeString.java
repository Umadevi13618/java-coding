package example;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a word");
String s=sc.nextLine();
//System.out.println(s);
String rev="";

for(int i=s.length()-1;i>=0;i--)
{
	 rev=rev+s.charAt(i);
}
System.out.println(rev);
	}

}
