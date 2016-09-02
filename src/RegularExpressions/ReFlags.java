package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReFlags {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE);
		Matcher m = p.matcher("java has regex \nJava has regex\n"
				+"JAVA has pretty good regular expressions\n"
				+"Regular expressions are in java");
		while(m.find()){
			System.out.println(m.group());
		}
	}

}
