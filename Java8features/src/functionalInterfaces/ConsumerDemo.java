package functionalInterfaces;

import java.util.function.Consumer;

//class ConsumerImpl implements Consumer<String>{
//
//	@Override
//	public void accept(String input) {
//		// TODO Auto-generated method stub
//		System.out.println(input);
//	}
//	
//}
public class ConsumerDemo {
	public static void main(String[] args) {
//		Consumer<String>consumer=new ConsumerImpl();
//		consumer.accept("Ramesh");
		//lambda
		Consumer<String> consumer=(input)->System.out.println(input);
		consumer.accept("Rames");
	}
}
