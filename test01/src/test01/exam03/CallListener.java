package test01.exam03;

public class CallListener implements Button.OnclickListener{

	@Override
	public void OnClick() {
		System.out.println("전화를 겁니다.");
	}

	@Override
	public void On() {
		System.out.println("휴대폰의 전원을 킵니다.");
		
	}

}
