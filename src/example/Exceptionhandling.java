package example;

public class Exceptionhandling {

	private static final String Null = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception");
		
		}
		catch(NullPointerException ne)
		{
			System.out.println("nullpointer exception");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception e");
		}
		/*catch(NullPointerException ne)
		{
			System.out.println("nullpointer exception");
			
		}*/

	}

}
