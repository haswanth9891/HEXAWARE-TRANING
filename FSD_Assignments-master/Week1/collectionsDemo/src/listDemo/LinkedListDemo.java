package listDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Akash");  
		al.add("Neeru");  
		al.add("Jwala");  
		al.add("Bhumi");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
