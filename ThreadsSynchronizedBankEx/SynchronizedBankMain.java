package ThreadsSynchronizedBankEx;

public class SynchronizedBankMain {
	public static void main(String args[]) {
		
		Bank sbi = new Bank();
	
		Thread t1 = new Accountant(sbi, 500);
		Thread t2 = new Accountant(sbi, 1000);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(sbi.getBalance());
		
		
	}

}
