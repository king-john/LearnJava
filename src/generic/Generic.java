package generic;

import java.util.ArrayList;
import java.util.List;

public class Generic {
	public <T> void f(T x){
         System. out.println("类型信息："+x.getClass().getName());
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Generic g = new Generic();
		g.f("String");
	}

}
