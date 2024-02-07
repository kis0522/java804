package sec02.exam04;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3001);
		} catch(InterruptedException e) {}
		
		System.out.println("메인 스레드 종료");
	}
}