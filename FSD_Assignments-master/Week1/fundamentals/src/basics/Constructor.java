package basics;


public class Constructor {
	
	int id;
	String name;

	public Constructor() {
	 super();
	 System.out.println("Default Constructor");
	}
	
	public Constructor(int i) {
		
		super();
		id = i;
		System.out.println("Parameterized Constructor with one parameter | Constructor Overloading");
	}
	
	public Constructor(int i, String n) {
		id = i;
		name = n;
		System.out.println("Parameterized Constructor with two parameters | Constructor Overloading");
		
	}
	
	public Constructor(Constructor c) {
		id = c.id;
		name = c.name;
		System.out.println("Copy Constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c1 = new Constructor();
		System.out.println("Default Constructor default value:\n" + "ID:" + c1.id + "| Name:" + c1.name);
		
		Constructor c2 = new Constructor(2);
		System.out.println("Parameterized Constructor with parameter value: " + c2.id);
		
        Constructor c3 = new Constructor(3, "Joy");
		System.out.println("Parameterized and Overloaded Constructor with parameter values:\n" + "ID:" + c3.id + "| Name:" + c3.name );
		
       Constructor c4 = new Constructor(c3);
       System.out.println("Copy Constructor object c1 values :\n" + "ID:" + c4.id + "| Name:" + c4.name + " which are same as c2 constructor values");
		
		
		

	}

}

