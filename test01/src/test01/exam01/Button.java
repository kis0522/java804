package test01.exam01;

public class Button {
	OnclickListener listener;
	
	void setOnclickListener(OnclickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnclickListener{
		void onClick();
	}
}