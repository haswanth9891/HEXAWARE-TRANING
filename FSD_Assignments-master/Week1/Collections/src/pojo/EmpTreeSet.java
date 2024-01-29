package pojo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import set.MyComparator;

public class EmpTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> set = new HashSet<Employee>();
		
		set.add(new Employee(106,"King", 8000));
		set.add(new Employee(105, "Tom", 5000));
		set.add(new Employee(107, "Madhu", 9000));
		set.add(new Employee(13,"Ramesh", 12000));
		
		System.out.println(set);
		
		Set<Employee> set2 = new TreeSet<Employee>(new MyComparator());
		
		set2.add(new Employee(101,"King", 8000));
		set2.add(new Employee(105, "Tom", 5000));
		set2.add(new Employee(104, "Maria", 6000));
		set2.add(new Employee(102, "Thomas", 7000));
		
		System.out.println(set2);

	}

}
