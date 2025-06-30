package chatTest01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException{
		ServerSocket serverSocket = null;
		
		Socket socket = null;
		
		BufferedReader reader = null;
		
		try {
			serverSocket = new ServerSocket(1100);
			System.out.println("서버가 시작! 클라이언트 대기중,,");
	
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결 완료!");
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String message = reader.readLine();
			System.out.println("클라이언트에게 받은 메세지 : " + message);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			if(reader != null) {
				reader.close();
			}
			if(socket != null) {
				socket.close();
			}
			if(serverSocket != null) {
				serverSocket.close();
			}
		}
		
	}

}
