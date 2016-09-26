package yin.learn.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class FormattedMemoryInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataInputStream in;
		try {
			in = new DataInputStream(
					new ByteArrayInputStream(
							BufferedInputFile
									.read("C:/Users/瑞栋/git/LearnJava/src/yin/learn/io/FormattedMemoryInput.java")
									.getBytes()));
			while (true)
				//从in输入流读出字节返回 并转成 char型
				System.out.print((char) in.readByte());
		} catch (IOException e) {
			System.err.println("End of Stream");
		}

	}

}
