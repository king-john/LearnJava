package yin.learn.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {

	public static String read(String fileName) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		String s ;
		StringBuilder sb = new StringBuilder();
		while((s=in.readLine()) !=null){
			sb.append(s+"\n");
		}
		in.close();//¹Ø±ÕÁ÷
		return sb.toString();
	}
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(read("D:/workspace/LearnJava/src/yin/learn/io/BufferedInputFile.java"));
	}

}
