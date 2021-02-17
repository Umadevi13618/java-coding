package example;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=343,r;
		int sum=0;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println(sum);
		int m=3%10;
		System.out.println(m);
	}

}
