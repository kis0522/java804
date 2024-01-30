package sec01.exam04;

public interface RemoteControl {
	//필드 = 상수
	int MAX_VOLUME = 10;	//static final 생략되어 있음
	int MIN_VOLUME = 0;
	
	//추상 메소드	abstract = 추상
	void trunOn();			//public abstract 생략되어 있음
	void trunOff();
	void setVolume(int volume);
	
}
