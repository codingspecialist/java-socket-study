package ex02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 양 끝에 포트를 달고 포트 사이에   byte stream을 달아서 통신!!
public class SocketServer {
	
    //  연결 받고, 스레드 만들고, 포트 새로 만들고 연결 끊고
	ServerSocket serverSocket; 
	Socket socket;
	
	public SocketServer() {
		try {
			serverSocket = new ServerSocket(10000); // 포트 번호
			socket = serverSocket.accept(); //  클라이언트의 요청이 왔을 때,
			System.out.println("나 실행안돼");
			/*
			 * BufferedWriter bw = new BufferedWriter(new
			 * OutputStreamWriter(socket.getOutputStream())); bw.write("안녕 \n"); bw.flush();
			 */
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
			pw.println("안녕");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SocketServer();
	}
}
