package streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindElements {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5,60);
		Optional<Integer>element=list.stream().findFirst();
		if(element.isPresent()) {
			System.out.println("Present "+element.get());
		}
		Optional<Integer>element1=list.stream().findAny();
		if(element1.isPresent()) {
			System.out.println("Present "+element.get());
		}
		//count,min,max
		long a=list.stream().count();
		Integer integer=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(a);
		System.out.println(integer);
		Integer max=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
	}
	
}
