package example;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar= new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add("rama");
		
		System.out.println(ar.size());
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
		for(int i=0;i<ar1.size();i++)
		{
			System.out.println(ar1.get(i));
		}
		
		//Employee class objects
		Employee e1=new Employee("Naveen",20,"QA");
		Employee e2=new Employee("Tom",30,"Dev");
		Employee e3=new Employee("Peter",40,"Admin");
		
		
		//create arraylist
		ArrayList<Employee> ar2=new ArrayList<Employee>();
		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);
		
		//Iterator to traverse the values
		Iterator<Employee> it=ar2.iterator();
		
		while(it.hasNext())
		{
			Employee emp=it.next();
			System.out.println(emp.name);
		    System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		

	}

}
