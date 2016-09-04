package List;

import java.util.*;

public class ForEachCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> cs = new LinkedList<String>();
		Collections.addAll(cs,
			"Take the long way home".split(" ")); 
		for(String s : cs)
		System.out.print("'"+s+"' ");
	}

}
