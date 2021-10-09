package corejavaconcept;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hashset,treeset,linkedhashset implements set interface
		//does not accept duplicate values
		//There is no Guarantee that element is store in Sequential order - Random order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		hs.add("JAPAN");
		hs.add("UAE");
		System.out.println(hs);
		hs.remove("UK");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//Iterator
		
		Iterator<String> i= hs.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
		//System.out.println(i.next());
		
	}

}
