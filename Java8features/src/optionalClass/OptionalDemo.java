package optionalClass;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
			//of,empty,ofNullable
		
		String email="amit@gmail.com";
		Optional<Object> emptyOptional=Optional.empty();
		System.out.println(emptyOptional);
	
	Optional<String> emailOptional=Optional.of(email);
	System.out.println(emailOptional);
	
	Optional<String> stringOptional=Optional.ofNullable(email);
	System.out.println(stringOptional);
	//wont throw nullpointerexception return empty
	
	System.out.println(stringOptional.get());
	//is present
	if(stringOptional.isPresent()) {
		System.out.println(stringOptional.get());
	}
	else {
		System.out.println("no value present");
	}
	//orElse method  return values or default value
	//orElseGet takes supplier lambda can be used
	//difference is parameter type
	//orElseThrow method
	
	String optionalObject=stringOptional.orElseThrow(()->new IllegalArgumentException("Email doesnot exist"));
	System.out.println(optionalObject);
	//if Present method
	//consumer type--returns nothing
	
	
	//filter method
	
	String result=" abc ";
	if(result!=null && result.contains("abc")) {
		System.out.println(result);
	}
	Optional<String> optionalstr=Optional.of(result);
	optionalstr.filter(res->res.contains("abc"))
	.map(String::trim)
	.ifPresent((res)->System.out.println(res));
	}
	
	//map method
	
}