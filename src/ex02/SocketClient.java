package ex02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;


public class SocketClient {
	
	Socket socket;
	
	public SocketClient() {
		try {
			socket = new Socket("localhost", 10000);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String line = br.readLine();
			System.out.println(line);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SocketClient();
	}
}
