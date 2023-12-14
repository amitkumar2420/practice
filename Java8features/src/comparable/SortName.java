package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"Amit",26));
		al.add(new Student(102,"Shubham",26));
		al.add(new Student(103,"Amisha",25));
		al.add(new Student(104,"Bhavan",26));
		Collections.sort(al);
		for(Student s:al) {
			System.out.println(s.id+" "+s.name+" "+s.age);
		}

	}

}
