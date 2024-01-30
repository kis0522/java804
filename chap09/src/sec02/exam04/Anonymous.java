package sec02.exam04;

public class Anonymous {
	private int field;
	
	//final 안적어도됨 하지만 자바 버전 8 이하면 적어야됨
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//arg1 = 20; //(final이여서 안됨)
		//arg2 = 20; //(final이여서 안됨)
		//var1 = 30; //(final이여서 안됨)
		//var2 = 30; //(final이여서 안됨)
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}