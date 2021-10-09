package corejavaconcept;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //can accept Duplicate values ( ArrayList,LinkedList,Vector )
		//Array have fixed size whereas Arraylist can grow dynamically
		//you can access and insert any value in any index
		ArrayList<String> a=new ArrayList<String>();
		a.add("rahul");
		a.add("java");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
		//a.remove(1);
		//System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("java"));
		System.out.println(a.indexOf("rahul"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}

}
