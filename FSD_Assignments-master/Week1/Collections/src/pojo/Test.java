package pojo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101, "King", 8000);
		
		Employee emp2 = new Employee();
		emp2.setEid(102);
		
		System.out.println(emp1);
		System.out.println(emp2);

	}

}
