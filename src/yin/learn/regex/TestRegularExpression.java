package yin.learn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
	//{Args : abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}"};
	/**
	 * @param args
	 */
	public static void main(String[] argss) {
		String[] args = //{"abcabcabcdefabc", "abc+", "(abc)+" ,"(abc){2,}"};
		  //{"Java now has regular expression","^java"};
		{"Java now has regular expression ,ere","\\w*ere"};
		// TODO Auto-generated method stub
	  System.out.println("Input :\"" +args[0] +"\"");
	  for(String arg:args){
		  System.out.println("Regular expression:\""+arg+"\"");
		  Pattern p = Pattern.compile(arg);
		  Matcher m = p.matcher(args[0]);
		  while(m.find()){
			  System.out.println("Match \"" + m.group()+"\" at positions"+
					  m.start()+"-"+(m.end()-1));
		  }
	  }
	}

}
