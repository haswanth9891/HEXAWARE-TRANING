package setDemo;


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Akash");  
		set.add("Neeru");  
		set.add("Jwala");  
		set.add("Bhumi");  
		set.add("Neeru"); 
		
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  

		}

	}
}
