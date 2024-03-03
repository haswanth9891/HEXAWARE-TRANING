package pojo;

import java.util.Comparator;

public class HotelComparator implements Comparator<Hotel>{

	@Override
	public int compare(Hotel h1, Hotel h2) {
		// TODO Auto-generated method stub
		String s1 = h1.toString();
		String s2 = h2.toString();
		return s1.compareTo(s2);
	}
	
	

}
