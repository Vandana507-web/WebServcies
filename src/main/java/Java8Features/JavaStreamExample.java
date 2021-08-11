package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Stream API examples holding
//print the price <3000 and its details
//Stream Iterate
//count
//List to map conversion
//sum
//min and max


public class JavaStreamExample {

	// print the price <3000 and its details
	public static void main(String[] args) {
		
		List<Product> productList=new ArrayList<Product>();
		productList.add(new Product(1,"Dal",200));
		productList.add(new Product(2,"BHel",500));
		productList.add(new Product(4,"Raagi",300));
		productList.add(new Product(3,"Rice",1000));
	//using normal approach	
   List<Integer>productPriceList=new ArrayList<Integer>();
   List<Integer> num=Arrays.asList(76,23,454,79,23,22,90);
   
   int minVal=num.stream().min((x,y)-> x.compareTo(y)).get();
   System.out.println("minval integer:"+ " "+minVal );
   for(Product prod:productList) {
	   if(prod.cost<=500) {
		   productPriceList.add(prod.cost);
	   }
   }
	System.out.println("Cost hless than :" + " "+productPriceList);
	
	//Stream API
List<Integer> prodds = productList.stream().filter(p -> p.cost>400).map(p->p.cost).collect(Collectors.toList());
List<String> names= productList.stream().filter(p->p.name.contains("dsfHel")).map(p-> p.name).collect(Collectors.toList());
	System.out.println(" list:"+ " "+ prodds);
	System.out.println(" list:"+ " "+ names);
	
	
	//Stream Iterate
	Stream.iterate(1,p->p+1).filter(p->p%5==0).limit(4).forEach(System.out::println);
	
	//to print the product above 300 cost
	productList.stream().filter(p->p.cost>300).forEach(p->System.out.println(p.name));

	//to print the sum of the cost of the products
	int price=productList.stream().collect(Collectors.summingInt(p->p.cost));
	System.out.println("Sum of the items:"+ " " +price);
	
	//max price
	Product piu=productList.stream().max((p1,p2)->p1.cost>p2.cost?1:-1).get();
	
	System.out.println(piu.name);
	
	//min cost 
	
	Product minValue=productList.stream().min((p1,p2)->p1.cost>p2.cost?1:-1).get();
	System.out.println(minValue.cost +" itemis"+ minValue.name);

	//count 
	
	long count=productList.stream().filter(p1->p1.id>2).count();// to rmbr this count return value in long float and double only .
	System.out.println("count:"+ ""+count);
	
	
	//converting List to map 
	
	//Map<Integer,String> prodMap=productList.stream().collect(Collectors.toMap(
			/*Map<Integer,String> productPriceMap =   
					productList.stream()  
                        .collect(Collectors.toMap(p->p.id, p->p.name));  */
	Map<Integer,String> prodMap = productList.stream().collect(Collectors.toMap(p->p.id, p->p.name));
	
	System.out.println(prodMap);
	
	
	
	}
}