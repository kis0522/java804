package sec02.exam01;

public class IntegerLiteralExample {
	//IntegerLiteralExample = 문자상의 정수 예
	public static void main(String[] args) {
		int var1 = 0b1011;	//0b = 2진수
		int var2 = 0206;	//0 = 8진수
		int var3 = 365;		//10진수
		int var4 = 0xB3;	//0x = 16진수

		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
	}
}