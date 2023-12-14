package streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>fruits=new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		List<String>sort=fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sort);
		//lambda
		List<String>sorted=fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(sorted);
		
		List<String>sorted1=fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted1);
		//descending
		List<String>sorted2=fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sorted2);
		//lambda
		List<String>sorted3=fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(sorted3);
		
		//sort employeeby salary asc
		List<Employee>employees=new ArrayList<Employee>();
		employees.add(new Employee(10,"Ramesh",30,400000));
		employees.add(new Employee(20,"Santosh",29,350000));
		employees.add(new Employee(30,"Sanjay",30,450000));
		employees.add(new Employee(40,"Pramod",29,500000));
		
		List<Employee>employeessorted=employees.stream().
				sorted((e1,e2)->(int)(e1.getSalary()-e2.getSalary())).
				collect(Collectors.toList());
		System.out.println(employeessorted);
		//desc
		List<Employee>employeessorted1=employees.stream().
				sorted((e1,e2)->(int)(e2.getSalary()-e1.getSalary())).
				collect(Collectors.toList());
		System.out.println(employeessorted1);
		//Comparator.comparingLong(Employee::getSalary)
		//Comparator.comparingLong(Employee::getSalary).reversed())
	}

}
