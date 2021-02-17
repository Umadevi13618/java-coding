package example;

public class Student {
	int a;                  //instance variable
	static int b;           //static variable
	Student()
	{
		b++;
	}
	public void showData()
	{
		System.out.println("value of a =" +a);
		System.out.println("value of b=" +b);
	}
	/*public static void increment()
	{
		a++;
	}
*/
}
