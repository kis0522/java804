package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		ImplementationC imp1 = new ImplementationC();

		InterfaceA A = imp1;
		A.methodA();
		System.out.println();

		InterfaceB B = imp1;
		B.methodB();
		System.out.println();
		
		InterfaceC C = imp1;
		C.methodA();
		C.methodB();
		C.methodC();
	}
}