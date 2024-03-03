package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import pojo.Employee;
import set.MyComparator;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new TreeMap<Integer, String>();
		
		map.put(99, "Bhumi");
		map.put(102, "Madhuri");
		map.put(109, "Madhav");
		map.put(102, "Ram");
		map.put(13,  "Janaki");
		
		System.out.println(map);
		
		Map<Employee, String> map2 = new TreeMap<Employee, String>(new MyComparator());
		
		map2.put(new Employee(101,"King", 8000), "Hyderabad");
		map2.put(new Employee(105, "Tom", 5000), "Mumbai");
		map2.put(new Employee(104, "Maria", 6000), "Pune");
		map2.put(new Employee(102, "Thomas", 7000), "Chennai");
		
		System.out.println(map2);
		

	}

}
