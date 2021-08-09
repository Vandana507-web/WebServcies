package com.in28minutes.spring.basics.springinsteps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Trail {

	private static final boolean String = false;

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Ram");
		names.add("Jhon");
		names.add("bhav");
		
		//iterators in java(1)
		for(int i=0;i<=names.size()-1;i++) {
			System.out.print("forloop:" + " "+names.get(i));
		}
		
		//iterator  in java(2)
		for(String s:names){
			System.out.println("forEACHloop:" + " "+names);
		}

		//iterator in java(3)
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println("iterator:" + " "+itr.next());
		}
		//iterator in java(4)
		names.forEach(System.out::print);
		
		//Lambda
		names.forEach(  
	            (n)->System.out.println(n)  
	        );  
		
	}
	//iterator in java(5)
	//names.stream().forEach((c) -> System.out.println(c)); 
	
}
