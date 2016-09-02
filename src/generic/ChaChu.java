package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChaChu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList(new String[]{"1","2"}));
		System.out.println(list.get(0).getClass());
	}

}
