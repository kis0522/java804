package sec01.exam05;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		
		System.out.println(outter.field);
		outter.method();
		System.out.println();
		
		Outter.Nested nested = outter.new Nested();
		System.out.println(nested.field);
		nested.method();
		System.out.println();
		
		nested.print();
	}
}