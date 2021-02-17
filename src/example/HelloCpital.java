package example;

public class HelloCpital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s="ahceclwlxo";
		String h="";
		
		for(int i=1;i<s.length();i=i+2)
		{
			h=h+s.charAt(i);
		}
		System.out.println(h.toUpperCase());
	}

}
