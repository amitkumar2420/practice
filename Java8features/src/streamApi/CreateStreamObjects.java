package streamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {
	public static void main(String[] args) {
		Stream<String> stream=Stream.of("a","b","c");
		stream.forEach(System.out::println);
	
	//from sources
	Collection<String> collection=Arrays.asList("JAVA","SPring","HIberNATE");
	Stream<String> stream2=collection.stream();
	stream2.forEach(System.out::println);
	//same also for list and set
	List<String> list=Arrays.asList("JAVA","SPring","HIberNATE");
	Stream<String> stream3=list.stream();
	stream3.forEach(System.out::println);
	//set
	Set<String> set=new HashSet<>(list);
	Stream<String> stream4=set.stream();
	stream4.forEach(System.out::println);
	//arrays
	String[] strarray= {"a","e"};
	Stream<String>stream5=Arrays.stream(strarray);
	stream5.forEach(System.out::println);
}
}