package reflect;

import java.lang.reflect.*;

public class Test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?> c = Class.forName("reflect.unknown");
		Constructor<?>[] cons = c.getConstructors();
		for(Constructor con:cons){
			System.out.println(con.toString());
		}
		Object o = c.getConstructor(java.lang.String.class,java.lang.String.class,java.lang.String.class).
				newInstance("a","b","c");
		System.out.println(o);
		
		Field[] fs = c.getFields();
		for(Field f :fs){
			System.out.println("filed:"+f);
			System.out.println("Object filedValue:"+f.get(o));
		}

		Field[] fds = c.getDeclaredFields();
		for(Field f :fds){
			System.out.println("filed:"+f);
			f.setAccessible(true);
			System.out.println("Object filedValue:"+f.get(o));
		}
		//Methods.getMethod("set", java.lang.String.class);
		System.out.println("---------------------");
		Method[] ms = c.getMethods();
		for(Method m :ms){
			System.out.println("Method:"+m.toString());
			if(m.toString().contains("set")){
				m.invoke(o, "aaa");
			}
//			if(m.toString().contains("get")){
//				m.invoke(o, null);
//			}
		}
		System.out.println("---------------------");
		System.out.println(o.toString());
	}

}
