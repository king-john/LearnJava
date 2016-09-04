package generics.fibonacci;

import net.mindview.util.Generator;

public class Fibonacci implements Generator<Integer>{
	private int count = 0;
	public Integer next() { return fib(count++); }
	private int fib(int n) { 
		if(n < 2) 
			return 1;
		return fib(n-2) + fib(n-1);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci gen = new Fibonacci(); 
		for(int i = 1; i < 18; i++)
			System.out.println(gen.next() + " ");
	}


}
