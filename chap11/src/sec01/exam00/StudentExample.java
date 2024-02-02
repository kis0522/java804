package sec01.exam00;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student("dsg", 30);
		Student s2 = new Student("dsg", 30);
		Student s3 = new Student("dst", 30);
		
		System.out.println("result : " + s1.equals(s2));
		System.out.println("s1.hashCode() = " + s1.hashCode());
		System.out.println("s2.hashCode() = " + s2.hashCode());
		System.out.println("s3.hashCode() = " + s3.hashCode());
	}
}