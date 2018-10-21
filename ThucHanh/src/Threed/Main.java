package Threed;

public class Main {

	public static void main(String[] args) {
		ThreedInB threedInB = new ThreedInB();
		threedInB.run();

		for (int i = 0; i < 1000; i++) {
			
			try {
				System.out.print("A");
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
