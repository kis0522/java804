package test01.exam04;

public class Button {
	OnClicklistener listener;
	
	void setOnClicklistener(OnClicklistener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClicklistener{
		void onClick();
	}
}
