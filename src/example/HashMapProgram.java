package example;
import java.util.*;
public class HashMapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hs=new HashMap<Integer, String>();
		hs.put(1, "hello");
		hs.put(2, "hi");
		hs.put(3, "abc");
		hs.put(4, "hud");
		hs.put(5, "hju");
		System.out.println(hs);
		for(Map.Entry<Integer, String> entry :hs.entrySet())
		{
			/*if(entry.getValue()=="hi")
			{
			System.out.print(entry);
			System.out.print(";");
		}*/
			if(entry.getKey()==3)
			{
				System.out.println(entry);
				break;
			}
			
	
		}
		

	}

	
}
