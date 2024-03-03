package charsequenceinterface;

import java.util.StringTokenizer;

public class StrToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("Welcome to World"," ");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());

	     }

	}
}
