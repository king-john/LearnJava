package operators;

public class URShift {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = -1;
		System.out.println(Integer.toBinaryString(i)); //Integer.toBinaryString(i)以二进制形式显示结果
		i >>>= 10;
		System.out.println(Integer.toBinaryString(i)); //Integer.toBinaryString(i)以二进制形式显示结果

		long l = -1;
		System.out.println(Long.toBinaryString(l));
		l >>>= 10;
		System.out.println(Long.toBinaryString(l));
		short s = -1;
		System.out.println(Integer.toBinaryString(s)); 
		s >>>= 10;
		System.out.println(Integer.toBinaryString(s)); 
		byte b = -1; 
		System.out.println(Integer.toBinaryString(b));
		b >>>= 10;
		System.out.println(Integer.toBinaryString(b));
		b = -1;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(b>>>10));
		


	}

}
