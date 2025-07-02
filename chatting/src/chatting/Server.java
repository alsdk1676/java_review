package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//~~~ 메세지 내보내기 ~~~
// 서버에서 모든 클라이언트에 메세지를 전송
class ServerThread extends Thread {
	private final Socket socket;
	private final List<PrintWriter> outputList;
	private PrintWriter output;
	private BufferedReader input;
	
	
//	socket을 이용해서 inputStream에 접근 가능
//	누가썼는지, 무슨 내용을 썼는지 읽어오기
	public ServerThread(Socket socket, List<PrintWriter> outputList) { 
		this.socket = socket;
		this.outputList = outputList;
		
		try {
			output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true); // true : auto Flush
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			synchronized (outputList) {
				outputList.add(output);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			closeResources();
		}
	}
	
	@Override
	public void run() {
		String line;
		
		try {
			while((line = input.readLine()) != null) {
//				서버 콘솔에 수신한 메세지를 출력
				System.out.println(line);
				
				synchronized (outputList) {
//					모든 값을 출력
					for(PrintWriter out : outputList) {
						out.println(line);
					}
				}
			}
		} catch (SocketException e) {
			System.out.println("사용자가 나갔습니다.");
		} catch (IOException e) {
			System.out.println("메세지를 수신 중에 오류 발생!");
			e.printStackTrace();
		} finally {
			closeResources();
		}
	}
	
//	finally 공통 부분 메서드 만들기
	private void closeResources() {
		try {
			synchronized (outputList) {
				outputList.remove(output);
			}
			if(input != null) {
				input.close();
	         }
	          
	         if(output != null) {
	        	 output.close();
	         }
	          
	         if(socket != null){
	             socket.close();
	         }
		} catch (IOException e) {
			System.out.println("자원을 해제 중에 오류 발생!");
		}
	}
} 

//~~~ 메시지 들고오기 ~~~
// 서버에서 직접 메세지를 입력 받아 클라이언트에 전송하는 스레드
class ServerInputThread extends Thread {
	private final List<PrintWriter> outputList;
	
	public ServerInputThread(List<PrintWriter> outputList) {
		this.outputList = outputList;
	}
	
	@Override
	public void run() {
		try ( 
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)) // System : 키보드 포함 => 키보드 읽기
			){
			
			String message;
			while((message = bufferedReader.readLine()) != null) {
				System.out.println("서버 : " + message);
				synchronized (outputList) {
					for(PrintWriter out : outputList) {
						out.println("서버 : " + message);
					}
				}
			} 
		} catch (IOException e) {
			System.out.println("서버 입력을 처리하는 중 오류 발생!");
			e.printStackTrace();
		}
	}
}

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		List<PrintWriter> outputList = Collections.synchronizedList(new ArrayList<>()); // 동기적으로 값을 추가
		
		try {
			serverSocket = new ServerSocket(8000);
			System.out.println("[서버 실행 : 클라이언트 대기중...]");
			
	         ServerInputThread serverInputThread = new ServerInputThread(outputList);
	         serverInputThread.start(); // start() : run()에 있는 메서드를 실행시키는 메서드
	         
	         while(true) {
	        	 Socket clientSocket = serverSocket.accept(); // 일대다로 연결
	             System.out.println("[접속 : " + clientSocket + "]");
	             ServerThread serverThread = new ServerThread(clientSocket, outputList);
	             serverThread.start(); 
	         }
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(serverSocket != null && !serverSocket.isClosed()) {
				try {
					serverSocket.close();
				} catch (IOException e) {
					System.out.println("서버 소켓 오류");
					e.printStackTrace();
				}
			}
		}
	}
	
	

}
