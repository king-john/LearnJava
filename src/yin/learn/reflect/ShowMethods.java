package yin.learn.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {

	private static Pattern p = Pattern.compile("\\w+\\.");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines = 0;
		Class<?> c;
		try {
			c = Class.forName(args[0]);
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			for(Method method:methods){
				System.out.println(p.matcher(method.toString()).replaceAll(""));
			}
			for(Constructor ctor:ctors){
				System.out.println(p.matcher(ctor.toString()).replaceAll(""));

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
