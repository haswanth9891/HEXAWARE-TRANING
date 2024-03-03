package inheritance;

public class Child extends Parent {
	int cid = 99;
	
	public Child() {
		super();
		System.out.println("Child object created");
	}
	
	public Child(int cid)
	{
		this.cid = cid;
		System.out.println("Parameterized Constructor of Child Class");
	}
	
	public void m2() {
		System.out.println("m2() is called from Child");
	}
	
	@Override
	public void m1() {
		System.out.println("m1() is called from Child");
	}
	
	@Override
	public String toString() {
		return "Class Object Here";
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		System.out.println(c.toString());
		
		System.out.println(c.cid);
		
		c.m2();
		
		System.out.println(c.pid);
		
		c.m1();
		
		Child c1 = new Child(101);
		
		System.out.println(c1.cid);
		
		Parent p = new Child();
		
		System.out.println(p);

		
		
		
	}

}
