package test01.exam01;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnclickListener(new CallListener());
		btn.touch();
		
		btn.setOnclickListener(new MessageListener());
		btn.touch();
	}
}