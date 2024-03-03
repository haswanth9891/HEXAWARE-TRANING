package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("Madhu");
		set.add("Brahmi");
		set.add("Kaloji");
		set.add("Sree Sree");
		
		System.out.println(set);
		
		Set<Integer> set2 = new HashSet<Integer>();
		
		set2.add(12);
		set2.add(56);
		set2.add(89);
		set2.add(45);
		
		System.out.println(set2);
		
		Set<Integer> set3 = new LinkedHashSet<Integer>();
		
		set3.add(12);
		set3.add(56);
		set3.add(89);
		set3.add(45);
		
		System.out.println(set3);
		

	}

}
