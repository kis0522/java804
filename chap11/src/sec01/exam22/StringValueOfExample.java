package sec01.exam22;

public class StringValueOfExample {
	//String 문자열변환 예제
	public static void main(String[] args) {
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
			
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1+str2);
		System.out.println(str3);
	}
}