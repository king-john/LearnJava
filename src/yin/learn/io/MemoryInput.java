package yin.learn.io;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringReader in = new StringReader(BufferedInputFile.read("C:/Users/瑞栋/git/LearnJava/src/yin/learn/io/MemoryInput.java"));
		int c;
		while ((c = in.read()) !=-1) {
			System.out.println((char)c);
			
		}
	}

}
