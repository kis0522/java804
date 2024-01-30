package verify.exam06;

public class ServiceExample {

	public static void main(String[] args) {
		Controller controller = new Controller();
		//controller.setService(new service());		//강제형변환 (실행안됨
		//controller.service.login();
		
		controller.setService(new MemberService());	//본인 불러옴
		controller.service.login();
		
		controller.setService(new AService());		//자동형변환
		controller.service.login();
		
	}
}