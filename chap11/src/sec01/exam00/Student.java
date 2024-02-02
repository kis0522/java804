package sec01.exam00;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		//if에 있는 this == obj 에 있는 this는 클래스를 의미한다
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Student student = (Student) obj;
		return age == student.age && Objects.equals(name, student.name);
	}
	
	//hashCode 는 문자열이 같을 때 주소를 같게 만들 수 있다.
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}
}