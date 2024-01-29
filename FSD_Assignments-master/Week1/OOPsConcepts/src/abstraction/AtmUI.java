package abstraction;

import java.util.Scanner;

public class AtmUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBank bank = new BankImp2();
		
		System.out.println("***Welcome to ATM***");
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {
			
			System.out.println("Enter 1. Deposit");
			System.out.println("Enter 2. Wuthdraw");
			System.out.println("Enter 3. Exit");
			
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				bank.deposit();
				break;
			case 2:
				bank.withdraw();
				break;
			case 3:
				flag = false;
				System.out.println("Thamk You Visit Again!!");
				break;
			default:
				break;
			
			}
			
			
		}

	}

}
