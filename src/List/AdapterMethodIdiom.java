package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class AdapterMethodIdiom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReversiableArrayList<String> ral = new ReversiableArrayList<String> (
		Arrays.asList("To be or not to be". split(" ")));
		// Grabs the ordinary iterator via iterator(): 
		for(String s : ral){
			System.out.print(s + " ");
		}
		System.out.println();
		//Hand it the Iterable of your choke
		for(String s : ral.reversed()){
			System.out.print(s + " ");
		}
	}

}
class ReversiableArrayList<T> extends ArrayList<T> {
	public ReversiableArrayList(Collection<T> c) {
		super(c);
	} 
	public Iterable<T> reversed(){
		return new Iterable<T>() {
			public Iterator<T> iterator(){
				return new Iterator<T>() {
					int current = size() -1;
					public boolean hasNext() {
						return current > -1;
					}
					public T next() {
						// TODO Auto-generated method stub
						return get(current--);
					}
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}	
		};
	}
}

