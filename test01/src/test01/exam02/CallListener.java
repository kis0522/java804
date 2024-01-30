package test01.exam02;

public class CallListener implements Button.OnClickListener{
//CallListener implements Button.OnClickListener = CallListener 클래스가 Button안에 있는 인터페이스 OnClickListener 상속
	@Override
	public void onClick() {
		System.out.println("전화가 옵니다");
	}
}
