package lambda;

public class ThreadTest {
	public static void main(String[] args) {
		
		Thread thread = new Thread( new Thread1()); // 별도의 클래스를 만들어 처리 업무를 맡긴다
		thread.start(); // run 메소드를 호출한다
		
		// 무명클래스 : 클래스 선언과 객체 생성을 한꺼번에 작동
		Thread thread2 = new Thread(new Runnable(){ 
			public void run() {
				for (int i = 2000; i < 2999; i++) {
					try {
						Thread.sleep(200);  // 0.2 초씩
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}});
		thread2.start();
		
		// 람다식 : 무명클래스(=) 대신에 사용 // 메서드가 하나뿐일 때만 사용가능
		Thread thread3 = new Thread(
				() -> {
			for (int i = 3000; i < 3999; i++) {
				try {
					Thread.sleep(200);  // 0.2 초씩
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
		});
		thread3.start();
		
		for(int i = 1000; i < 1999; i++) {
			try {
				Thread.sleep(200);  // 0.2 초씩 멈춘다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
		
	}
}
