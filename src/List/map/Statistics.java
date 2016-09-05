package List.map;

import java.util.*;

public class Statistics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random(47);
		Map<Integer , Integer> m =new HashMap<Integer, Integer>(); 
		for(int i = 0; i < 10000; i++) { 
			// Produce s number between 6 and 20:
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
					m.put(r, freq == null ? 1 : freq + 1);
		}
		
		System.out.println(m);

	}

}
