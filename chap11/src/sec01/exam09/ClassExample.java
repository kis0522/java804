package sec01.exam09;

public class ClassExample {

	public static void main(String[] args) {
		//how1
		Class clazz = Car.class;
		
		//how2
		//Class clazz = Car.forName("sec01.exam09.Car");
		
		//how3
		//Class clazz = Car.getclass;
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName()
		);
	}
}