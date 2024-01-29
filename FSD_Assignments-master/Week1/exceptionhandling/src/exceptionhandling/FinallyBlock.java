package exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {    
			int data=65/0;    
	        System.out.println(data);    
	      }   
		  catch(ArithmeticException e){  
	        System.out.println("Exception handled");  
	        System.out.println(e);  
	      }   
	  
	         
	      finally {  
	        System.out.println("finally block");  
	      }    
	  
	      System.out.println("rest of the code...");    

	}

}
