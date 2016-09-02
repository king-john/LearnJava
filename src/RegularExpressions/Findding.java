package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Findding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matcher m = Pattern.compile("(\\w+).").matcher("Eveing is full");
		int i =1 ;
		while(m.find()){
			System.out.println(m.group()+i);
			i++;
		}
	}

}
