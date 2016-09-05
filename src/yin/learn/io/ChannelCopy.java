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
		while(in.read(buffer) !=-1){//每次read之后会将数据输入到缓冲器buffer
			buffer.flip();//准备缓冲器可以write()提取
			out.write(buffer);
			buffer.clear();//write之后数据还在缓冲器里面 使用clear()操作对所有内部指针重新安排
		}
		
	}

}
