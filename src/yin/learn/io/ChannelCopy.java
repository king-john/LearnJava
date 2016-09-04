package yin.learn.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelCopy {
	public static final int BSIZE = 1024;
	

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		if(args.length !=2){
			System.out.println("11111");
			System .exit(1);
		}
		FileChannel 
		 in= new FileInputStream(args[0]).getChannel(),
		 out = new FileOutputStream(args[1]).getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
		while(in.read(buffer) !=-1){//ÿ��read֮��Ὣ�������뵽������buffer
			buffer.flip();//׼������������write()��ȡ
			out.write(buffer);
			buffer.clear();//write֮�����ݻ��ڻ��������� ʹ��clear()�����������ڲ�ָ�����°���
		}
		
	}

}
