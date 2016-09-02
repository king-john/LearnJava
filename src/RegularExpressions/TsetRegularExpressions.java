package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TsetRegularExpressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java now has regular expressions
		String args1[] = {"Java now has regular expressions","^Java"};
		//,"(abc)+","(abc){2,}"
		/*if(args1.length > 2){
			System.out.print("Usage:\njava TestRegular Expressions" 
		+ "characterSequence RegularExpressions");
			System.exit(0);
		}*/
		System.out.println("Input: \""+args1[0]+"\"");
		for(String arg:args1){
			System.out.println("正则表达式：\""+arg+"\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args1[0]);
			
			while(m.find()){//字符串中是否存在子字符串匹配正则表达式
				System.out.println(m.matches());//整个字符窜是否匹配正则表达式
				System.out.println(m.lookingAt());//始部分是否匹配正则表达式模式
				System.out.println("Match \""+m.group()+"\"at positions"+m.start()+"-"+(m.end() - 1));
			}

		}
	}

}
