package example;

import java.util.ArrayList;

public class ArrayList_VirtualCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> ar=new ArrayList<Object>();
		System.out.println(ar.size());
		ar.add(100);
      System.out.println(ar.size());
      ar.add(10);
      ar.add(20);
      ar.add(30);
      }

}
