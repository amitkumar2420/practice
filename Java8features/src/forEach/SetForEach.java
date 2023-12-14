package forEach;

import java.util.HashSet;
import java.util.Set;

public class SetForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person>set=new HashSet<>();
		set.add(new Person("Ramesh",20));
		set.add(new Person("Tony",50));
		set.add(new Person("Tom",70));
		set.add(new Person("John",55));
		
		for(Person person:set) {
			System.out.println(person.getName());
			System.out.println(person.getAge());
		}
		//for each and lambda
		set.forEach(person->{
			System.out.println(person.getName());
			System.out.println(person.getAge());
		});
		//stream with for each
		set.stream().forEach(person->{
			System.out.println(person.getName());
			System.out.println(person.getAge());
		});
		
	}

}
