package List;

import java.util.*;

public class EnvironmentVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(Map.Entry entry: System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());

		}
	}

}
