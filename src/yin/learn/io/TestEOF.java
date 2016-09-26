package yin.learn.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestEOF {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream in = new DataInputStream( new BufferedInputStream(
				new FileInputStream("C:/Users/瑞栋/git/LearnJava/src/yin/learn/io/TestEOF.java"))); 
		while(in.available()!= 0)
				System.out.println((char)in.readByte());
	}

}
