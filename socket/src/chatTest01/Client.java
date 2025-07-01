package chatTest01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws IOException {
		
		Socket socket = null;
		PrintWriter writer = null;
		String serverIp = "";
		
		try {
			
			socket = new Socket(serverIp, 1100); 
			System.out.println("서버 연결 완료!");
			
			writer = new PrintWriter(socket.getOutputStream(), true);
			
			String message = "클라이언트임 😎";
			
			writer.println(message);
			System.out.println("서버로 [" + message + "]라는 메세지를 보냈습니다.");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(socket != null) {
				socket.close();
			}
			if(writer != null) {
				writer.close();
			}
			
		}
		
	}

}
