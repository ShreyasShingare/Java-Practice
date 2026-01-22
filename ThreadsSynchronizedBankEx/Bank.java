package ThreadsSynchronizedBankEx;

public class Bank{
	
	public int balance;
	
	public synchronized void deposit(int amount) {
		balance = balance + amount;
	}
	
	public synchronized int getBalance() {
		return this.balance;
	}
	
	public synchronized void withdraw(int withdrawAmount) {
		if(balance >= withdrawAmount) {
			balance = balance - withdrawAmount;
		}
		else {
			System.out.println("Balance less than withdraw amount...");
		}
	}
	

}
