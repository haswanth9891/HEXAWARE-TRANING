package com.hexaware;

public class StringModification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("hello");
		
		s1.concat("world");
		
		System.out.println(s1);
		
        s1 = s1.concat("world");
		
		System.out.println(s1);
		
		StringBuffer sb1 = new StringBuffer("Hello");
		
		sb1.append("World");
		
		System.out.println(sb1);
		
		

	}

}
