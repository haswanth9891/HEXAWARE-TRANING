package exceptionhandling;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 17;
		if(age < 18) {
			throw new ArithmeticException("Not eligible to vote");
		}
		else {
			System.out.println("Eligible to vote");
		}

	}

}
