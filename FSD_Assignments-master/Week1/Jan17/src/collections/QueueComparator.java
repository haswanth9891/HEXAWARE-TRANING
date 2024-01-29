package collections;

import java.util.Comparator;

public class QueueComparator implements Comparator {



	

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((String) o1).compareTo((String)o2);
	} 
}