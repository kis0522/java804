package sec01.exam06;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("String2");		//class의 변수를 생성 했을때 변수명은 class가 될수 없다
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
		/*Class clazz = Class.forName("String2");*/
	}
}