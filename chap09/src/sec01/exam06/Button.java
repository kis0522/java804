package sec01.exam06;

public class Button {
	//인터페이스 타입 필드를 선언
	OnClickListener listener;
	
	//인터페이스는 객체 생성을 못하니까 외부에서 받을 수 있도록 setter 설정
	void setOnClickListener(OnClickListener listener) {	//매개 변수의 다형성
		this.listener = listener;
	}
	
	//실제 버튼을 클릭 했을 때 실행하는 내용을 작성하지 않음
	void touch() {
		listener.onClick();	//구현 객체의 onClick() 메소드 호출
	}
	
	//static가 선언된 interface는 객체 없이 사용가능
	//중첩 인터페이스 : 버튼을 클릭했을때 실제로 실행할 내용을 담고 있는 구현객체를 얻기 위해...
	static interface OnClickListener{
		void onClick();
	}
}