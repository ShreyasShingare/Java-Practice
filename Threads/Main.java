package Threads;

public class Main {
	public static void main(String args[]) {
		
		First f = new First();
		Second s = new Second();
		
		f.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {  //sleep throws an interrupted exception, so we need try-catch
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.start();
		
		
		
	}

}
