package sec01.exam04;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";		//a가 들어가서 value2에서 int로 받을 수가 없다.
		
		int value1= Integer.parseInt(data1);
		int value2= Integer.parseInt(data2);

		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);
	}

}
