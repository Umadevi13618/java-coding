package example;

import java.util.HashMap;
import java.util.Map;

public class OccurenceofWord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello and Hello an Hello";
		String[] words=s.split(" ");
		System.out.println(words.length);
		HashMap<String, Integer> hashmap=new HashMap<String, Integer>();
		for(String word : words)
		{
			String tempword=word.toLowerCase();
			if(hashmap.containsKey(tempword))
			{
				hashmap.put(tempword, hashmap.get(tempword)+1);
			}
			else
				hashmap.put(tempword, 1);
		}
		for(Map.Entry<String, Integer> entry:hashmap.entrySet())
		{
			System.out.println(entry.getKey() + entry.getValue());
		}
	}
}