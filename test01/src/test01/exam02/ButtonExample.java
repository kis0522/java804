package test01.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();		//Button class에서 Button(){} 생성자를 만들지 않아도 자동으로 생성됨
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();		
	}

}
