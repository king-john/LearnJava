package yin.learn.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class CharSets {
	public static final int BSIZE = 1024;
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Charset cs = Charset.defaultCharset();
		System.out.println(cs);
		cs = Charset.forName("utf-8");
		System.out.println(cs);
		String s= "hahahhaµÄºó¹Ë";
		FileChannel 
		 out = new FileOutputStream(new File("D:/io/io.txt")).getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
		buffer.put(s.getBytes(cs));
		buffer.flip();
		out.write(buffer);
		out.close();
	}

}
