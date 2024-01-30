package test01.exam04;

public class MessageListener implements Button.OnClicklistener{
	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
}
