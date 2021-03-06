package net.mindview.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
public class TextFile extends ArrayList<String> {

	// Read a file as a single string:
	/**
	 * 读取并返回文件内容
	 * @param fileName 文件名
	 * @return 文件内容字符串
	 */
	public static String read(String fileName) {
		StringBuilder sb = new StringBuilder();
		try {
			//FileReader类生成文件输入流
			//再由BufferedReader包装进行用以缓冲输入
			BufferedReader in = new BufferedReader(new FileReader(new File(
					fileName).getAbsoluteFile()));
			try {
				String s;
				//循环从输入流中readLine()读取一个文本行 直到 到达流末尾，则返回 null
				while ((s = in.readLine()) != null) {
					sb.append(s);
					sb.append("\n");

				}
			} finally {
				//关闭输入流
				in.close();
			}
		} catch (IOException e) {
			//捕捉并抛出异常
			throw new RuntimeException(e);
		}
		//返回输入流读取内容
		return sb.toString();
	}

	// Write a single file in one method call:
	/**
	 * 向文件写入数据
	 * @param fileName 文件名
	 * @param text 写入数据
	 */
	public static void write(String fileName, String text) {
		try {
			//PrintWriter对象可以向文件写入数据
			PrintWriter out = new PrintWriter(
					new File(fileName).getAbsoluteFile());
			try {
				//写入数据
				out.print(text);
			} finally {
				//关闭输出流
				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	// Read a file, split by any regular expression；
	/**
	 * 读取文件内容，并用正则表达式进行分割
	 * @param filename
	 * @param splitter
	 */
	public TextFile(String filename, String splitter) {
		super(Arrays.asList(read(filename).split(splitter)));
		// Regular expression split() often leaves an empty
		// String at the first position;
		if (get(0).equals(""))
			remove(0);
	}

	// Normally read by lines：
	/**
	 * 构造器
	 * @param fileName 文件名
	 */
	public TextFile(String fileName) {
		//正则"\n" 换行符
		this(fileName, "\n");
	}
	/**
	 * 将当前对象内容写入文件
	 * @param fileName
	 */
	public void write(String fileName) {
		try {
			PrintWriter out = new PrintWriter(
					new File(fileName).getAbsoluteFile());
			try {
				for (String item : this)
					out.print(item);
			} finally {
				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	// Simple test:
	public static void main(String[] args) {

		String file = read("C:/Users/瑞栋/git/LearnJava/src/net/mindview/util/TextFile.java"); 
		write("test.txt", file);
		TextFile text = new TextFile( "test.txt"); 
		text.write("test2.txt");
		//Break Into unique sorted list of words:
		TreeSet<String> words = new TreeSet<String>( new TextFile("C:/Users/瑞栋/git/LearnJava/src/net/mindview/util/TextFile.java","\\W+"));
		//Display the capitalized words：
		System.out.println(words.headSet("a"));
	}
}
