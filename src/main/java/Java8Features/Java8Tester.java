package Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Java8Tester {

	
	public static void main(String[] args) {
		
		
		//Lambda expersions
		List<String> names = new ArrayList<>();
		
		names.add("Elv");
		names.add("Doll");
		names.add("Ziya");
		names.add("Suma");
		names.add("Chetan");
		names.add("Anu");
		names.add("Bita");
		
		System.out.println("not-sorted:" + " "+ names);
	
		Java8Tester test = new Java8Tester();
		test.sortUsing7(names);
		test.sortUsing8(names);
		
		
	}
		//using java 7
     public void sortUsing7(List<String>names) {
    	 Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}});
    	 
    	 System.out.println("Java 7"+ " "+names);
     }
     
     //using java 8
    	public void sortUsing8(List<String> nam) {
    		Collections.sort(nam,(s1,s2)->s1.compareTo(s2));

    		System.out.println("Java 8"+ " "+nam);
	
    	}
    	 
     }
	
	



