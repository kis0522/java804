package sec01.exam05;
//implements 2개 이상 상속 가능
public class SmartTelevision implements RemoteControl ,Searchable{
	public int volume;
	
	@Override
	public void trunOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("TV를 끕니다.");		
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
		System.out.println("현재 TV 불륨 : " + this.volume);
	}
	
	@Override
	public void search(String url) {
		System.out.println(url + "을(를) 검색합니다.");
	}
}
