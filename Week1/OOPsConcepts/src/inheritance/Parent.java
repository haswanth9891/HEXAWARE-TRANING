package inheritance;

public class Parent extends Object {
	
	int pid = 100;
	
	public Parent() {
		super();
		System.out.println("Parent Object is created");
	}
	
	public void m1() {
		
		System.out.println("m1() called from Parent");
	}

}
