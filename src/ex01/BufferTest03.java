package ex01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferTest03 {
	public static void main(String[] args) {
		InputStream in = System.in; // 1  바이트 씩 읽는데, 아스키코드로 읽음.
		InputStreamReader ir = new InputStreamReader(in); // 고정된 길이의 바이트를 읽어!!
		BufferedReader br = new BufferedReader(ir);
		
		try {
			String data = br.readLine();
			System.out.println(data);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
