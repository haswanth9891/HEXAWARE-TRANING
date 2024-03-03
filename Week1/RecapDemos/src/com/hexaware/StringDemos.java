package com.hexaware;

public class StringDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemos d1 = new StringDemos();
		StringDemos d2 = new StringDemos();
		
		//equals() method from object class compares hashcode
		System.out.println(d1.equals(d2)); 
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		//equals() method from string class overriden from object class compares content
		System.out.println(str1.equals(str2));
		//above new operator is being used, so two different referneces and different hashcodes
		// == opeartor is used to compare hashcode for string class objects
		System.out.println(str1 == str2);
		
		String str3 = "World";
		String str4 = "World";
		
		System.out.println(str3.equals(str4));
		// new operator is not being used, for same value two different references are not created, so same hashcode
		System.out.println(str3==str4);
		

	}

}
