package sec01.exam27;

public class MathExample {

	public static void main(String[] args) {
		//Math.abs = -제거
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		
		//Math.ceil 소수점 올림
		double v3 = Math.ceil(5.3);			//6출력
		double v4 = Math.ceil(-5.3);		//-5출력
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);
		
		//Math.floor 소수점 내림
		double v5 = Math.floor(5.3);		//5출력
		double v6 = Math.floor(-5.3);		//-6출력
		System.out.println("v5 = " + v5);
		System.out.println("v6 = " + v6);
		
		//Math.max 큰거 보여주기
		int v7 = Math.max(5,9);
		double v8 = Math.max(5.3,2.5);
		System.out.println("v7 = " + v7);
		System.out.println("v8 = " + v8);
		
		//Math.min 작은거 보여주기
		double v9 = Math.min(5,9);
		double v10 = Math.min(5.3,2.5);
		System.out.println("v9 = " + v9);
		System.out.println("v10 = " + v10);
		
		//Math.random 랜덤
		double v11 = Math.random();
		System.out.println("v11 = " + v11);
		
		//Math.rint 가까운 정수
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12 = " + v12);
		System.out.println("v13 = " + v13);
		
		//Math.round 반올림
		double v14 = Math.round(5.3);
		double v15 = Math.round(5.7);
		System.out.println("v14 = " + v14);
		System.out.println("v15 = " + v15);
		
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v16 = temp2 / 100.0;
		System.out.println("v16 = " + v16);
	}
}