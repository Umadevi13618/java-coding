package example;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="laptop";
		char ch[]=s.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++)
		{
			if(	map.containsKey(ch[i]))
			{
				map.put(ch[i],map.get(ch[i])+1);
			}
			else
				map.put(ch[i],1);
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey() + "\t\t" + entry.getValue());
		}

	}

}
