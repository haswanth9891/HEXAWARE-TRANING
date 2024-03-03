package exceptionhandling;

public class ThrowsDemo {
	
	public static void method(int age) throws ArithmeticException{
		if(age < 18) {
			throw new ArithmeticException("Not eligible to vote");
		}
		else {
			System.out.println("Eligible to vote");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(17);

	}

}
