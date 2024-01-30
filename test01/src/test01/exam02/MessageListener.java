package test01.exam02;

public class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("메세지가 왔습니다.");
	}
}
