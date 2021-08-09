package com.in28minutes.spring.basics.springinsteps;

public class PatterMatcher {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=0; i<n; i++)    //   0<5 // 1<5 //
		{   
		for(int j=0; j<=i; j++)   //   0<=0 // 1<=1 //
		{   
		System.out.print("* ");       
		}   
		System.out.println();         
		
	}
	}
}
