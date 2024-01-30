package sec02.exam05;
class Number{
	static int num = 0;	//스태틱 필드 : number1.num++; 여기있는 +1을 가져와서 num = 1이됨 (공유)
	int num2 = 0;		//인스턴스 필드
}

public class StatucExample {

	public static void main(String[] args) {
		Number number1 = new Number();
		Number number2 = new Number();
		
		number1.num++;	//클래스 필드 num을 1 증가시킴
		number1.num2++;	//인스턴스 필드 num을 1 증가시킴
		System.out.println(number2.num);	//두번째 number의 클래스 필드 출력	: 필드에 있는 +1 되어있는 num을 가져와서 1이됨
		System.out.println(number2.num2);	//두번째 number의 인스턴스 필드 출력
	}
}