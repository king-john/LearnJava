package Internet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

//URL:ͳһ��Դ��λ��һ��URL�Ķ��󣬶�Ӧ�Ż�������һ����Դ��
//���ǿ���ͨ��URL�Ķ����������Ӧ�ķ�����������Դ��ȡ�������ء���
public class TestURL {
	public static void main(String[] args) throws Exception {
		//1.����һ��URL�Ķ���
		URL url = new URL("http://127.0.0.1:8080/examples/HelloWorld.txt");
		//File file = new File("�ļ���·��");
		/*
		 *  public String getProtocol(  )     ��ȡ��URL��Э����
			public String getHost(  )           ��ȡ��URL��������
			public String getPort(  )            ��ȡ��URL�Ķ˿ں�
			public String getPath(  )           ��ȡ��URL���ļ�·��
			public String getFile(  )             ��ȡ��URL���ļ���
			public String getRef(  )             ��ȡ��URL���ļ��е����λ��
			public String getQuery(   )        ��ȡ��URL�Ĳ�ѯ��
		 */
//		System.out.println(url.getProtocol());
//		System.out.println(url.getHost());
//		System.out.println(url.getPort());
//		System.out.println(url.getFile());
//		System.out.println(url.getRef());
//		System.out.println(url.getQuery());
//		http
//		127.0.0.1
//		8080
//		/examples/HelloWorld.txt
//		null
//		null
		
		
		//��ν�����˵���Դ��ȡ����:openStream()
		InputStream is = url.openStream();
		byte[] b = new byte[20];
		int len;
		while((len = is.read(b)) != -1){
			String str = new String(b,0,len);
			System.out.print(str);
		}
		is.close();
		//��������ݵ����룬������ݵ����������ʹ��URLConnection
		URLConnection urlConn = url.openConnection();
		InputStream is1 = urlConn.getInputStream();
		FileOutputStream fos = new FileOutputStream(new File("abc.txt"));
		byte[] b1 = new byte[20];
		int len1;
		while((len1 = is1.read(b1)) != -1){
			fos.write(b1, 0, len1);
		}
		fos.close();
		is1.close();
	}
}
