package Threed;

public class ThreedInB extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {

			try {
				System.out.print("B");
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
