package example;

public class HelloExtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="AHCECLWLXO";
		String h="";
		 for(int i=1;i<s.length();i=i+2)
		 {
			
			 h=h+s.charAt(i);
			 
			 
		 }
System.out.println(h);
	}

}
