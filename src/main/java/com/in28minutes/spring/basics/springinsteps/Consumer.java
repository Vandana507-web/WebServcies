package com.in28minutes.spring.basics.springinsteps;

public class Consumer {
	public static void main(String args[])  {
		try {
			checkAge(81);
		} catch (CustomisedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			intAge(20);
		} catch (CustomisedException e) {
			
			System.out.println("Catched exception:" + " "+e);
		}
	}
	
	
	public static void intAge(int age) throws CustomisedException{
		if(age<18)
			throw new CustomisedException("not eligible");
		else {
			System.out.println("good to go");
		}
		
	}
	public static void checkAge(int age) throws CustomisedException {
		intAge(81);
	}

}
/*
 1.create a customised exception extends the exception with parametersed constructor aslo invking super method
 2. In the main class/wheerever ur calling that intAge method u must throws in method declaration , along with the method throws cust exception in method declaration
 3.also should throw in the method
 4.then in main method 
 a)either main method should throws the exception in method declaration
 b)or surround the method
 */

