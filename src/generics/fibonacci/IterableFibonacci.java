package generics.fibonacci;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{
	private int n;
	public IterableFibonacci(int count) { n = count;}
	public Iterator<Integer> iterator(){ 
		return new Iterator<Integer>() {
			public boolean hasNext() { return n > 0; } 
			public Integer next() { 
				n--;
				return IterableFibonacci.this.next() ;
			}
			public void remove() {
				// Not implernenteol 
				throw new UnsupportedOperationException();
			}
		};
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i : new IterableFibonacci(18))
			System.out.println(i +" ");
	}

}
