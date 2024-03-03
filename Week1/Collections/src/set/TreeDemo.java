package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet<String>();
		
		set.add("B");
		set.add("D");
		set.add("C");
		set.add("A");
		
		System.out.println(set);
		
		Set<Integer> set2 = new TreeSet<Integer>();
		
		set2.add(12);
		set2.add(56);
		set2.add(89);
		set2.add(45);
		
		System.out.println(set2);

	}

}
