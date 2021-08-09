package com.in28minutes.spring.basics.springinsteps;

public class LambdaExpression {

	public static void main(String[] args) {
		int width=10;
		Drawable d=()->{
			
			System.out.print("hello"+ " "+width );
		};
d.draw();
/*
// using lambda to filter data  
Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);  
  
// using lambda to iterate through collection  
filtered_data.forEach(  
        product -> System.out.println(product.name+": "+product.price)  
);  
	}*/

}
}
