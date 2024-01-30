package sec01.exam06;
//인터페이스를 상속하기 위해서는 extends 대신 implements를 사용해야 한다.
public class Audio implements RemoteControl{
	private int volume;

	@Override
	public void trunOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 불륨 : " + this.volume);
	}
}