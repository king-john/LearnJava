package List;

import java.util.*;

public class SetOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> setl = new HashSet<String>();
				Collections.addAll(setl,
				"A B C D E F G H I J K L".split(" ")); 
				setl.add("N");
				System.out.println("H: "+ setl.contains("H")) ; 
				System.out.println("N: "+ setl.contains("N")) ; 
				Set<String> set2 = new HashSet<String>() ;
				Collections.addAll(set2,"H I J K L" .split(" ")); 
				System.out.println("set2 in setl £º " + setl.containsAll(set2));
				setl.remove("H");
				System.out.println("setl£º " + setl);
				System.out.println( "set2 in setl: " + setl.containsAll(set2));
				setl.removeAll(set2);
				System.out.println("set2 removed from setl: " + setl);
				
				Collections.addAll(setl,"X V Z" .split(" ")); 
				System.out.println("'X V Z' added to setl: " + setl);
						

	}

}
