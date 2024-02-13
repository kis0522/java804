package sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test3.db");
		
		byte[] array = {65,66,67,68,69};
		
		os.write(array,1,3);
		
		os.flush();	
		os.close();
	}
}