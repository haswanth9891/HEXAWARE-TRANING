package abstraction;

public abstract class BankImp1 implements IBank{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit Success");
		
	}
	
	public abstract void withdraw();

	

}
