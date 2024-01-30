package sec01.exam04;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.trunOn();
		rc.setVolume(5);
		rc.trunOff();
				
		rc = new Audio();
		rc.trunOn();
		rc.setVolume(5);
		rc.trunOff();
		
	}
}