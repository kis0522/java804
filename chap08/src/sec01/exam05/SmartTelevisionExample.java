package sec01.exam05;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();

		RemoteControl rc = tv;
		rc.trunOn();
		rc.setVolume(5);
		rc.trunOff();
		
		Searchable searchable = tv;
		searchable.search("kis7543@dothome.co.kr");
	}
}