package charsequenceinterface;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Welcome to";
		
		char[] c = {'J','A','V','A'};
		String s2 = new String (c);
		
		String s3 = new String("Class");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//Strings are Immutable
		String s = "Rana";
		s.concat("Daggubati");
		System.out.println(s);
		s = s.concat("Daggubati");
		System.out.println(s);
		
		System.out.println(s.substring(4));
		System.out.println(s.substring(0,4));
		
		String c1 = "Rana";
		String c2 = new String("Rana");
		String c3 = "RANA";
		String c4 = "Sachin";
		String c5 = "Abdul Kalam";
		String c6 = "Rana";
		
		//equals() method
		System.out.println("Using equals() method");
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c4));
		System.out.println(c1.equalsIgnoreCase(c3));
		
		// == operator
		System.out.println("Using == operator");
		System.out.println(c1==c6);
		System.out.println(c1==c2);
		System.out.println(c1==c4);
		
		// compareTo method
		System.out.println("Using compareTo() method");
		System.out.println(c1.compareTo(c2));
		System.out.println(c1.compareTo(c4));
		System.out.println(c1.compareTo(c5));
		
		
		
		
				
		
		
		

	}

}
