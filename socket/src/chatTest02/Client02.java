package chatTest02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) throws IOException {
		
		Socket clientSocket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		String serverIp = "localhost";
		
		try {
			clientSocket = new Socket(serverIp, 7777);
			System.out.println("서버 연결 완료");
			
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			
			while(true) {
				System.out.println("클라이언트 : ");
				String outMessage = sc.nextLine();
				
				out.write(outMessage + "\n");
				out.flush();
				
				String inMessage = in.readLine();
				System.out.println("서버 : " + inMessage);
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(sc != null) {
				sc.close();
			}
			if(out != null) {
				out.close();
			}
			if(in != null) {
				in.close();
			}
			if(clientSocket != null) {
				clientSocket.close();
			}
			
		}
		
	}

}
