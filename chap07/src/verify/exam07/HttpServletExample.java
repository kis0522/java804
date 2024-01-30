package verify.exam07;

public class HttpServletExample {

	public static void main(String[] args) {
		method(new LoginServlet());	//LoginServlet() <-여기에 있는 소괄호는 생성자
		method(new FileDownloadServlet());
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}