package sec02.exam03;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.Onclick();
	}
	
	static interface OnClickListener{
		void Onclick();
	}
}
