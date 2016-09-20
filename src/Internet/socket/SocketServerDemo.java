package Internet.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(8099);
		while (true) {
			Socket so = server.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					so.getInputStream()));
			String str = in.readLine();
			System.out.println(str);
			so.close();
		}
	}

}
