package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");			//list (0)번 자리에 Java를 추가
		list.add("JDBC");			//list (1)번 자리에 JDBC를 추가
		list.add("Servlet/JSP");	//list (2)번 자리에 Servlet/JSP를 추가
		list.add(2, "Database");	//list (3)번 자리에 Database를 추가 후 (2)번 자리를 차지 = (2)번 자리에 있던 Servlet/JSP가 3번으로 이동
		list.add("iBATIS");			//list (4)번 자리에 iBATIS를 추가
		
		int size = list.size();					//list.size() = list에 생성한(add) 숫자 0,1,2,3,4 : 5 출력
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2);				//list.get(2) : 2번자리에 있는 리스트를 가져온다.
		System.out.println("2 : " + skill);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.remove(2);							//list.remove(2) : 2번 자리에 있는 Database를 지운다.
		list.remove(2);							//list.remove(2) : 2번 자리에 있는 Servlet/JSP를 지운다.
		list.remove("iBATIS");					//list.remove("iBATIS") : 리스트에 있는 iBATIS를 지운다.
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}
}