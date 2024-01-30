package sec01.exam06;

public class MyClass {
	//필드
	RemoteControl rc = new Television();
	
	MyClass(){
		
	}
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.trunOn();
		rc.setVolume(5);
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.trunOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.trunOn();
		rc.setVolume(5);		
	}
}