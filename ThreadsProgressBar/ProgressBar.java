package ThreadsProgressBar;

public class ProgressBar extends Thread{
	
	public void run() {
		System.out.print("[");
		for(int i=0;i<=10;i++) {
			System.out.print("#");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted Progress... "+e.getMessage());
			}
		}
		System.out.print("]");
		System.out.println("Thread process completed");
	}

}
