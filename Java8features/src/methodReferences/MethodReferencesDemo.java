package methodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
	void print(String msg);
}

public class MethodReferencesDemo {
	
	public void display(String msg) {
		msg=msg.toUpperCase();
		System.out.println(msg);
	}
	
	public static int addition(int a,int b) {
		return (a+b);
	}
	
	public static void main(String[] args) {
		//     1.Method Reference to a static method
		Function<Integer,Double> function=(input)->Math.sqrt(input);
		System.out.println(function.apply(4));
		
		//lambda to method reference
		Function<Integer,Double> functionMethodRef=Math::sqrt;
		System.out.println(functionMethodRef.apply(4));
		
		//1 more example
		BiFunction<Integer,Integer,Integer> biFunctionLambda=(a,b)->MethodReferencesDemo.addition(a,b);
		System.out.println(biFunctionLambda.apply(10, 20));
		
		//convert to method reference
		BiFunction<Integer,Integer,Integer> biFunction=MethodReferencesDemo::addition;
		System.out.println(biFunction.apply(10, 20));
		
		//2.Method Reference to an instance metod of an object
		//cretae object then call method
		MethodReferencesDemo methodReferencesDemo=new MethodReferencesDemo();
		//lambda
		Printable printable=(msg)->methodReferencesDemo.display(msg);
		printable.print("Hello world");
		//method references
		Printable printableMethodRef=methodReferencesDemo::display;
		printableMethodRef.print("Hello world");
		
		//3.reference to instance method of arbitary object
		Function<String,String> stringFunction=(input)->input.toLowerCase();
		System.out.println(stringFunction.apply("JAVA Guides"));
		//method references
		Function<String,String> stringFunctionMethodRef=String::toLowerCase;
		System.out.println(stringFunctionMethodRef.apply("JAVA Guides"));
		
		//1 more example
		String[] str= {"A","E","I","O","U","a","e","i","o","u"};
		//using lambda
		Arrays.sort(str,(s1,s2)->s1.compareTo(s2));
		//method references
		Arrays.sort(str,String::compareToIgnoreCase);
		
		//4.Reference to a constructor
		List<String> fruits=new ArrayList<>();
		fruits.add("Banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("melons");
		Function<List<String>,Set<String>> setFunction=(fruitsList)->new HashSet<>(fruitsList);
		System.out.println(setFunction.apply(fruits));
		//method references
		Function<List<String>,Set<String>> setFunctionMethodRef=HashSet::new;
		System.out.println(setFunctionMethodRef.apply(fruits));	
	}
}
