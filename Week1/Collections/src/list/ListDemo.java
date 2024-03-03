package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Number>list = new ArrayList<Number>();
		
		list.add(30); //new Integer(30) considers as object using wrapper class
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(40);
		list.add(null);
		list.add(4.6);
		list.add(8.56f);
		list.add(10000000);
		System.out.println(list);
		System.out.println("Iterator");
		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("For Each Loop");
		for(Number n: list) {
			System.out.println(n);
		}
		

	}

}
