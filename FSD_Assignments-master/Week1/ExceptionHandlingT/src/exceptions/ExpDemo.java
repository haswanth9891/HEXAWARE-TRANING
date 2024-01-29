package exceptions;

public class ExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Open File");
		System.out.println("Read Data from file");
		int result = 0;
		try {
			result = div(10,0); //new ArithmeticException(); exception object thrown by JVM
			System.out.println("Result: " + result);
			String s = null;
			int n = s.length();
		}catch(ArithmeticException e) {
			System.err.println("Sorry, you can't divide a number by 0");
		}catch(NullPointerException n) {
			System.err.println("Pointing to Null");
			n.printStackTrace();
		}
		
		finally {
			System.out.println("Close file");
		}

	}
	
	public static int div(int a, int b) {
		return a/b;
	}

}
