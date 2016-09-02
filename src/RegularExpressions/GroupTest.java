package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupTest {

	public static void main(String[] args) throws Exception {
		Pattern p = Pattern.compile("(ca)(t)(s)");
		Matcher m = p.matcher("catsone cat,two  in the yard");
		if(m.find()){
			for(int i =1 ;i<=m.groupCount();i++){
				System.out.println("组号"+i+"匹配子字符串："+m.group(i)+"  position:"+m.start(i)
						+"-"+m.end(i));
			}
		}
		System.out.println("lookingAt():"+m.lookingAt());
//		System.out.println("该次查找获得匹配组的数量为：" + m.groupCount());
//		for(int i =1 ;i<=m.groupCount();i++){
//			System.out.println("组号"+i+"匹配子字符串："+m.group(i));
//		}
		
	}

}
