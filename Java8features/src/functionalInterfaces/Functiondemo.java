package functionalInterfaces;

import java.util.function.Function;

//class FunctionImpl implements Function<String,Integer>{
//
//	@Override
//	public Integer apply(String t) {
//		// TODO Auto-generated method stub
//		return t.length();
//	}
//	
//}
public class Functiondemo {
	public static void main(String[] args) {
//		Function<String,Integer> function=new FunctionImpl();
//		System.out.println(function.apply("Ramesh"));
		
		//lambda
		Function<String,Integer> function=(String s)->s.length();
		System.out.println(function.apply("Ramesh"));
		//BiFunction
		//BiFunction<Integer,Integer,Integer> bifunction=(s,u)->(s+u);
		//System.out.println(bifunction.apply(10,20));
		//andThen from function to Bifunction
		//Function<Integer,Integer> function=(n->n*n));
		//Integer in=biFunction.andThen(function).apply(10,20);
	}

}
