package forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx {
	public static void main(String[] args) {
		
		List<Person>list=new ArrayList<Person>();
		list.add(new Person("Ramesh",20));
		list.add(new Person("Tony",50));
		list.add(new Person("Tom",70));
		list.add(new Person("John",55));
		//without foreach
		for(Person person:list) {
			System.out.println(person.getAge());
		}
		//for Each
		list.forEach(person->{
			System.out.println(person.getName());
			System.out.println(person.getAge());
		});
		//stream
		list.stream().forEach(person->{
			System.out.println(person.getName());
			System.out.println(person.getAge());
		});
	}
}
class Person{
	private int age;
	private String name;
	public Person(String name,int age) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
