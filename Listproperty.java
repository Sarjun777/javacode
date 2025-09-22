package basicprogram;

import java.util.ArrayList;
import java.util.List;

public class Listproperty {

	public static void main(String[] args) {
		
		
		List l1=new ArrayList();
		
		l1.add("Sarju");
		l1.add('C');
		System.out.println(l1);
		
		List <String> l2=new ArrayList<String>();
		l2.add("Sarjun");
		l2.add("Ridwin");
		l2.addAll(l1);
		l2.add(0, "Sar");
		l2.addAll(0, l1);
		l2.add(null);
		l2.add(null);
		
		System.out.println(l2);
	
		System.out.println(	l2.get(5));
				
		
		

	}
	

}
