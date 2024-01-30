package test01.exam03;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnclickListener(new CallListener());
		btn.setOn();
		btn.touch();
		
		
		btn.setOnclickListener(new MessageListener());
		btn.setOn();
		btn.touch();
	}
}