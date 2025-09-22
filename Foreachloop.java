package basicprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Foreachloop {

	public static void main(String[] args) {
		
		
		Map <String,Integer> m1=new <String,Integer> HashMap  ();
		
		m1.put("SArjun",90);
		m1.put("SAun",90);
		m1.put("SArjjndun",90);
		m1.put("SAdjkcmrjun",90);
		System.out.println(m1);
		
		for(   String a:m1.keySet())
		{
			System.out.println(a);
		}
		
		for(Integer b:m1.values())
		{
			System.out.println(b);
		}
		
		for(Entry<String, Integer> c:m1.entrySet())
		{
			System.out.println(c);
		}
		
		
		
		Set <Entry<String, Integer>> d=m1.entrySet();
		System.out.println(d);
		
		Iterator i1= d.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		

	}

}
