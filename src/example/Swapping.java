package example;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10,y=20;
		
		System.out.println("before swapping" + x + y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping" + x + y);
		
		int a=10,b=20, temp;
		System.out.println("before swapping" + a + b);
		
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping" + a + b);
	}

}
