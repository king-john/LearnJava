package yin.learn.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 * 缓冲输入文件
 * @author 瑞栋
 *
 */
public class BufferedInputFile {
	/**
	 * 打开一个文件用于字符输入
	 * 使用以String或File对象作为文件名的 FileInputReader
	 * 为了提髙速度。我们希望对个文件进行缓冲，那么我们将所产生的引用传给一个BufferedReader构造器。
	 * 由于BufferedReader也提供readLine()方法，所以这是我们的最终对象和进行读取的接口。
	 * 当readLine() 将返回null时，你就达到了文件的末尾.
	 * @param fileName 文件名
	 * @return 文件内容字符串
	 * @throws IOException
	 */
	public static String read(String fileName) throws IOException {
		//Reading input by lines
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		String s ;
		StringBuilder sb = new StringBuilder();
		while((s=in.readLine()) !=null){
			sb.append(s+"\n");
		}
		in.close();
		return sb.toString();
	}
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		///
		System.out.println(read("C:/Users/瑞栋/git/LearnJava/src/yin/learn/io/BufferedInputFile.java"));
	}

}
