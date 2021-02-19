package lambda;

public class Thread1 implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i < 999; i++) {
			try {
				Thread.sleep(200);  // 0.2 초씩
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

}
