package annotation;

import java.util.ArrayList;
import java.util.List;

public class Sample2 {
	@ExceptionTest(ArithmeticException.class)
	public static void m1(){
		int i = 0;
		i = i/0;
	}
	
	@ExceptionTest(ArithmeticException.class)
	public static void m2(){
		int[] a = new int[0];
		int i = a[1];
	}
	
	@ExceptionTest(ArithmeticException.class)
	public static void m3(){
	
	}
	@ExceptionTest({IndexOutOfBoundsException.class,NullPointerException.class})
	public static void doubleBad(){
		List<String> list = new ArrayList<String>();
		list.addAll(5,null);
	}
}
