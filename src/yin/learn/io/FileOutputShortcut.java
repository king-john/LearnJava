package yin.learn.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class FileOutputShortcut {

	static String file = "FileOutputShortcut.out";

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new StringReader(
		BufferedInputFile.read("C:/Users/瑞栋/git/LearnJava/src/yin/learn/io/FileOutputShortcut.java")));
		// Here's the shortcut:
		//Java SE5在PrintWriter中添加了一个辅助构造器，使得你不必在每次希望创建文本文件并 向其中写人时，都去执行所有的装饰工作
		PrintWriter out = new PrintWriter(file);
		// old
		// PrintWriter out = new PrintWriter( new BufferedWriter (new FileWriter(file))); 
		int lineCount = 1;
		String s;
		// 循环从输入流中readLine()读取一个文本行 直到 到达流末尾，则返回 null
		while ((s = in.readLine()) != null)
			// 向输出流 输出行号和每次读取的文本行 字符串 然后终止该行
			out.println(lineCount + ": " + s);
		out.close();
		// Show the stored file:
		System.out.println(BufferedInputFile.read(file));

	}

}
