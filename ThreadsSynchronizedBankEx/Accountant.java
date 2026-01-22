package ThreadsSynchronizedBankEx;

public class Accountant extends Thread{
	
	Bank myBank;
	int amount;
	
	public Accountant(Bank myBank, int amount) {
		this.myBank = myBank;
		this.amount = amount;
	}
	
	public void run() {
		myBank.deposit(amount);
		myBank.withdraw(100);
	}
	
	
	

}
