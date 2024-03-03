package basics;

public class Student {
	
	int sid;
	String sname;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		
		s1.sid = 01;
		s1.sname = "Amar";
		
		System.out.println("Student 1 ID: " + s1.sid);
		System.out.println("Student 1 Name: " + s1.sname);
		
		Student s2 = new Student();
		
		s2.sid = 02;
		s2.sname = "Baalu";
		
		System.out.println("Student 2 ID: " +s2.sid);
		System.out.println("Student 2 Name: " +s2.sname);
		
		

	}

}
