package yin.learn.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {

	static String file = "BasicFileOutput.out";
	public static void main(String[] args) throws IOException {
		//调用BufferedInputFile静态方法read读取文件并返回文件内容字符串
		//通过StringReader构建字符输入流
		//使用BufferedReader将流包装起来用以缓冲输入
		BufferedReader in = new BufferedReader( new StringReader(
				BufferedInputFile.read("C:/Users/瑞栋/git/LearnJava/src/yin/learn/io/BasicFileOutput.java")));
		//FileWriter对象可以向文件写人数据。首先，创建一个与指定文件连接的FileWriter.
		//实际上，我们通常会用BufferedWriter将其包装起来用以缓冲输出
		//为了提供格式化机制，它被装饰成 了PrintWriter。按照这种方式创建的敎据文件可作为普通文本文件读取:
		PrintWriter out = new PrintWriter( new BufferedWriter (new FileWriter(file))); 
		int lineCount = 1;
		String s;
		//循环从输入流中readLine()读取一个文本行 直到 到达流末尾，则返回 null
		while( (s = in.readLine()) != null ) 
			//向输出流 输出行号和每次读取的文本行 字符串 然后终止该行
			out.println(lineCount + ": " + s); 
		out.close();
		// Show the stored file:
		System.out.println (BufferedInputFile.read (file));

	}

}
