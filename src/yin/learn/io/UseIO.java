package yin.learn.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UseIO {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File infile = new File("D:/work/IO/input.txt");
		System.out.println(infile.exists());

		File outfile = new File("D:/work/IO/output.txt");
		System.out.println(outfile.exists());

		FileInputStream in = null;
		FileOutputStream out = null;
		BufferedInputStream buffIn = null;
		BufferedOutputStream buffout = null;
		try {
			in = new FileInputStream(infile);
			out = new FileOutputStream(outfile);
			buffIn = new BufferedInputStream(in);
			buffout = new BufferedOutputStream(out);

			byte[] buffer = new byte[4096];
			int bytesToRead;//read读取返回的字节数

			while ((bytesToRead = buffIn.read(buffer)) != -1) {
				//从缓冲区中循环读取字节数组并将其存储在缓冲区数组 buffer中  直到流末尾已到达而不再有数据，则返回 -1
				// write(byte[] b, int off, int len)
		        // 将指定字节数组中从偏移量 off 开始的 len 个字节写入此输出流。
				buffout.write(buffer, 0, bytesToRead);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//资源关闭
			buffIn.close();
			buffout.close();
			in.close();
			out.close();

		}

	}

}
