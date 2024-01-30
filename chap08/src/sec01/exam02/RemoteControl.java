package sec01.exam02;
//원래 interface 앞에 static final 붙여야 되는데 안붙여도 자동으로 붙는다.
//static final = 상수
public interface RemoteControl {
	int MAX_VOLUME = 10;		//상수는 보통 대문자만 쓴다
	int MIN_VOLUME = 0;
}