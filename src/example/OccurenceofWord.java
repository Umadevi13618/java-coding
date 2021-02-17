package example;

import java.util.HashMap;
import java.util.Map;

public class OccurenceofWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Occurence of of a a word word word";
		HashMap<String,Integer> hashmap=new HashMap<String,Integer>();
		
		String[] words=str.split(" ");
		for(String word : words)
		{
			String tempword=word.toLowerCase();
			if(hashmap.containsKey(tempword))
			{
			hashmap.put(tempword,hashmap.get(tempword)+1);
			}
			else
				hashmap.put(tempword,1);
		}
		for(Map.Entry<String,Integer> entry : hashmap.entrySet())
		{
			System.out.println(entry.getKey() +"\t\t"+ entry.getValue());
		}
		

	}

}
