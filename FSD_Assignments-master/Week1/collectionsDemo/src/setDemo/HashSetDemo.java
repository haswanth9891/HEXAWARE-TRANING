package setDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();  
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
