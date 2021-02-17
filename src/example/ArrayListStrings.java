package example;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Jon");
		ar.add("Tom");
		ar.add("James");
		ar.add("Steve");
	
		//traverse the values using for loop
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("________");
		//traverse through for each loop
		for(String s:ar)
		{
			System.out.println(s);
		}
		System.out.println("_____");
		// traverse using iterator
		
		Iterator<String> it=ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}
	

}
