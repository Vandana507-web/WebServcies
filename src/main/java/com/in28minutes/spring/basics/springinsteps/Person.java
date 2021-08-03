package com.in28minutes.spring.basics.springinsteps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Person {

	public static void main(String[] args) {
		//arraylist to hashset
		//arraylist to treeset
		//stream
		//remove duplicates code
		
		List<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(10);
		arr.add(30);
		arr.add(90);
		
	Set<Integer> hashed =new HashSet<>(arr);
	Set<Integer> tree=new TreeSet<>(arr);
	Set<Integer>  str= arr.stream().collect(Collectors.toSet());
	//Set<Integer>  str= arr.stream().collect(Collectors.
	
	System.out.println("stream:"+ " "+ str);
	System.out.println("removed duplicates using hashset:"+ " "+ hashed);
	System.out.println("sorted:"+ " "+ tree);
	
	
int ar[]= new int[] {1,3,5,4,6,5,2,1};
   

System.out.println("original array" +" "+"length of arrayis:"+ar.length);



for(int i =0;i<ar.length;i++) {
	for(int j=i+1;j<ar.length;j++) {
		if(ar[i]==ar[j]){
			System.out.println("duplicate :" +""+ar[i]);			
		}
	}
}
	}	

}
