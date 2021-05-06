package ex01;

import java.io.IOException;
import java.io.InputStream;

public class BufferTest01 {
	
	public static void main(String[] args) {
		InputStream in = System.in;
		
		try {
			int data = in.read(); // 락 !!
			System.out.println(data);
			System.out.println((char)data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
