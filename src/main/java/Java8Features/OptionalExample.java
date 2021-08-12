package Java8Features;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		//defined array in two ways
		String[] str= new String[] {"ABHI","Bindu","CHai","Deesh","Elv"};
		String[] strs=new String[5];
		strs[0]="dhg";
		strs[1]="djhx";
		//String lower=strs[2].toLowerCase();
		
		//System.out.println("withoutoptional class:"+ " "+lower);
		
		//to overcome the nullpointer exception we use option class in java
		Optional<String> checkNull=Optional.ofNullable(strs[2]);
		if(checkNull.isPresent()) {
			String toLower= strs[2].toLowerCase();
			System.out.println("withOptionalClass:"+ " "+toLower);
		}
		else {
			System.out.println("NULL");
		}
		
		//empty
		Optional<String> empty =Optional.empty();
		Optional<String> value =Optional.of(str[2]);
		System.out.println("Empty value:"+ " "+empty);
		
		
	  // If value is present, it returns an Optional otherwise returns an empty Optional
		System.out.println("Filteredvalue:"+ " "+ value.filter((s)-> s.equals("Bi")));
		System.out.println("Filtered value: "+value.filter((s)->s.equals("CHai")));  
		
		// It returns value of an Optional. if value is not present, it throws an NoSuchElementException    
        System.out.println("Getting value: "+value.get());  
        
        // It returns hashCode of the value  
        System.out.println("Getting hashCode: "+value.hashCode());
        
        // It returns true if value is present, otherwise false  
        System.out.println("Is value present: "+value.isPresent());
        
        // It returns non-empty Optional if value is present, otherwise returns an empty Optional  
        System.out.println("Nullable Optional: "+Optional.ofNullable(str[1])); 
        
        // It returns value if available, otherwise returns specified value,  
        System.out.println("orElse: "+value.orElse("Value is not present"));  
        System.out.println("orElse: "+empty.orElse("Value is not present"));  
		
        value.ifPresent(System.out::println);
		

	}

}
