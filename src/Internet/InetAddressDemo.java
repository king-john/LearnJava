package Internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress net = InetAddress.getByName("www.atguigu.com");
		
		System.out.println(net);
		//InetAddress对象所含域名
		System.out.println(net.getHostName());
		//InetAddress对象所含ip地址
		System.out.println(net.getHostAddress());
		
		//获取本机的域名和ip地址
		InetAddress localnet = InetAddress.getLocalHost();
		
		System.out.println(localnet);
		//InetAddress对象所含域名
		System.out.println(localnet.getHostName());
		//InetAddress对象所含ip地址
		System.out.println(localnet.getHostAddress());
	}

}
