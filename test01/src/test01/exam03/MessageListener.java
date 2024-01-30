package test01.exam03;

public class MessageListener implements Button.OnclickListener{

	@Override
	public void OnClick() {
		System.out.println("메세지를 보냅니다.");
	}

	@Override
	public void On() {
		System.out.println("문자 메세지를 엽니다.");
		
	}

}
