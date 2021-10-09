package corejavaconcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hasMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
	
		hm.put(0, "Hello");
		hm.put(1, "Good Morning");
		hm.put(2, "GoodBye");
		hm.put(3, "Thank you");
		System.out.println(hm);
		System.out.println(hm.get(2));
		hm.remove(3);
		System.out.println(hm.get(3));
		Set sn =hm.entrySet();
		Iterator i=sn.iterator();
		while(i.hasNext())
		{
			Map.Entry mp= (Map.Entry)i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
		//HashMap - Non Synchronized & Not Thread Safe ,do not required any multi Threading task, allow one null key and any number of null values,iterated by using iterator.
		//HashTable - Synchronized & Thread Safe ,used in multi threading applications, do not allow null key and null values, use Enumerator to Iterator.
		
		
		
	}

}
