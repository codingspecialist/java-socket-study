package ex01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferTest02 {
	public static void main(String[] args) {
			InputStream in = System.in;
			InputStreamReader ir = new InputStreamReader(in);
		
		try {	
			char[] inData = new char[10000];
			ir.read(inData);
			System.out.println(inData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
