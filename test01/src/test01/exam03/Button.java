package test01.exam03;

public class Button {
	OnclickListener listener;
	
	void setOnclickListener(OnclickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.OnClick();
	}
	
	void setOn() {
		listener.On();
	}
	
	static interface OnclickListener{
		void OnClick();
		void On();
	}
}
