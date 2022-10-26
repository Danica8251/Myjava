package tw.brad.myjava;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 * 用戶端
 * */

public class Brad64 {

	public static void main(String[] args) {
		
			try {
				Socket socket = new Socket(InetAddress.getByName("10.0.102.45"),7777);
				
				OutputStream out = socket.getOutputStream();
				out.write("Hello, Brad".getBytes());
				out.flush();
				out.close();
				
				System.out.println("Client OK");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		
		}
	}
