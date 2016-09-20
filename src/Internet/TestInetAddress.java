package Internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * ����ͨ�ŵĵ�һ��Ҫ�أ�IP��ַ��ͨ��IP��ַ��Ψһ�Ķ�λ��������һ̨����
 * InetAddress:λ��java.net����
 * 1.InetAddress�������IP��ַ��һ��InetAdress�Ķ���ʹ����һ��IP��ַ
 * 2.��δ���InetAddress�Ķ���getByName(String host)
 * 3.getHostName(): ��ȡIP��ַ��Ӧ������
 *   getHostAddress():��ȡIP��ַ
 */
public class TestInetAddress {
	public static void main(String[] args) throws Exception {
		//����һ��InetAddress����getByName()
		InetAddress inet = InetAddress.getByName("www.atguigu.com");
		//inet = InetAddress.getByName("42.121.6.2");
		System.out.println(inet);
		//��������
		System.out.println(inet.getHostName());
		System.out.println(inet.getHostAddress());
		//��ȡ�����IP:getLocalHost()
		InetAddress inet1 = InetAddress.getLocalHost();
		System.out.println(inet1);
		System.out.println(inet1.getHostName());
		System.out.println(inet1.getHostAddress());
	}
}
