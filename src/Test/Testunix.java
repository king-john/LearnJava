package Test;

import java.util.Date;

public class Testunix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Long.toString(new Date().getTime()));
		System.out.println("获取系统毫秒数方法2："+Long.toString(System.currentTimeMillis()));
		Date date = new Date(1448524843064L);
		System.out.println(date.toString());
	}

}
