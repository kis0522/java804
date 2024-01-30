package test01.exam04;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClicklistener(new CallListener());
		btn.touch();
		
		btn.setOnClicklistener(new MessageListener());
		btn.touch();
	}
}