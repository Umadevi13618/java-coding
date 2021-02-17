package example;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDup_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,2,5,4,5,7,4};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		Iterator it=set.iterator();
		while(it.hasNext())
		{
System.out.println(it.next());
	}

}
}
