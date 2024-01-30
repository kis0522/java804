package test01.exam04;

public class CallListener implements Button.OnClicklistener{
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}
