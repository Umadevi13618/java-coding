package example;

import java.util.HashMap;
import java.util.Map;

public class Duplicatenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,3,4,5,6,6,6,7,7,7,8,8,9};
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			//int tempnum=a[i];
			if(map.containsKey(a[i]))
			{
				map.put(a[i],map.get(a[i])+1);
			}
			else
				map.put(a[i],1);
			
		}
		
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			//System.out.println(entry.getKey() + "\t\t" + entry.getValue());
			System.out.println(entry.getKey());
		}
		
		
		
		
	}

}
