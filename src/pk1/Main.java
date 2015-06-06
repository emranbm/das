package pk1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.println(InetAddress.getByName("MRCODER-LAPTOP"));
			ServerSocket ss = new ServerSocket(5000);
			Socket client = ss.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}