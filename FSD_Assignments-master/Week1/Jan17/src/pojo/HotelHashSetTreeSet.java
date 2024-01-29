package pojo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HotelHashSetTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Hotel> set = new HashSet<Hotel>();
		
		set.add(new Hotel(101, "Cozy Inn", "Madhapur"));
		set.add(new Hotel(104, "Luxury Resort", "Gachibowi"));
		set.add(new Hotel(103, "Rest Inn", "HiTech City"));
		set.add(new Hotel(104, "Luxury Resort", "Gachibowi"));
		set.add(new Hotel(14, "Relax Resort", "LB Nagar"));
		
		System.out.println(set);
		
		Set<Hotel> set2 = new TreeSet<Hotel>(new HotelComparator());
		
		set2.add(new Hotel(101, "Cozy Inn", "Madhapur"));
		set2.add(new Hotel(104, "Luxury Resort", "Gachibowi"));
		set2.add(new Hotel(103, "Rest Inn", "HiTech City"));
		set2.add(new Hotel(104, "Luxury Resort", "Gachibowi"));
		
		System.out.println(set2);

	}

}
