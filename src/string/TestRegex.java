package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pattern p = Pattern.compile("^[0-9]+\\.{0,1}[0-9]{0,2}$");
		//ƥ�俪ͨ 1������0-9�����ַ�
		Matcher m = p.matcher("11.9");
		System.out.println(m.find());*/
		
		Pattern p = Pattern.compile("^1([357]3|77)[0-9]{8}$");
		//ƥ�俪ͨ 1������0-9�����ַ�
		Matcher m = p.matcher("17319305101");
		System.out.println(m.find());
		
	}

}
