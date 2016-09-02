package reflect;

import java.lang.reflect.*;

public class ReflectTest {

	public static void getClassWays() throws Exception {
		/**
		 * ����ֽ����Ӧ��ʵ������� 3 �ַ�ʽ �� String Ϊ��
		 */
		String testStr = "goodleiwei";
		Class getClassWay1 = testStr.getClass();
		Class getClassWay2 = String.class;
		Class getClassWay3 = Class.forName("java.lang.String");
		
		System.out.println(getClassWay2);
		System.out.println(getClassWay1 == getClassWay2);
		System.out.println(getClassWay2 == getClassWay3);
	}

	public static void testReflectConstructor() throws Exception{
		/**
		 * ���췽���ķ���Ӧ�ã����췽���ǲ�������ĸ���;�� ���һ��������й��췽�� Constructor[] getConstructor =
		 * Class.forName("java.lang.String").getConstructors();
		 */
		String str1 = (String) Class.forName("java.lang.String").newInstance(); // Ĭ�Ϲ��췽��
																				// �õ��ֽ������ʵ������

		String str2 = (String) Class.forName("java.lang.String") // �õ��ֽ��뼴��������
				.getConstructor(StringBuffer.class) // ��øö����е��ض�������
				.newInstance(new StringBuffer("abc")); // ���ݹ�������������ʵ��
		System.out.println(str2.charAt(2));
		
	}
	
	public static void testFiled() throws Exception{
		/**
		 * ��Ա�����ķ��� Field
		 */
		User user2 = new User(3, 5);
		Field fieldX = user2.getClass().getField("x");
		// fieldX ��ֵ�Ƕ��� ? �� 3, �� !fieldX ���Ƕ������ϵı������������ϵı�����Ҫ�� fieldX ��ĳ��������ȥȡֵ�磺
		System.out.println(fieldX.get(user2));

		// ���ڲ��ɼ��� private ���ε��ֶ�ֻ��ͨ�����·�ʽ��ò���������� java.lang.NoSuchFieldException
		// java.lang.IllegalAccessException
		Field fieldY = user2.getClass().getDeclaredField("y");
		fieldY.setAccessible(true);
		System.out.println(fieldY.get(user2));
		/**
		 * ��Ա�����ķ���Ӧ�� Field
		 * 
		 * �� user ���е� String �����ֶ�֮�е� s ȫ���ĳ� H
		 */
		User user = (User) Class.forName("yin.learn.reflect.User").newInstance();
		changStringValue(user);
		System.out.println(user);
	}
	
	public static void testReflectMethod()throws Exception{
		/**
		 * ��Ա�����ķ���Ӧ�� Method ���� User �� main ����
		 */
		// new User().main(new String[]{"111","222","333"}); ��ͳ�ĸɷ�

		/*
		 * ��֪��Ҫ���� ������������� --- ���� run as-->run configuration-->arguments ������ com
		 * .jiaocaigen.User ��Ȼ���� java.lang.ArrayIndexOutOfBoundsException
		 */
		String startingClassName = "reflect.User";
		// �����ȡ�� main ����
		Method method = Class.forName(startingClassName).getMethod("main",
				String[].class);
		/*
		 * ���þ�̬������һ����������Ҫ��ֵ �ڶ����������� д��������ʽ �� new Object[]{new
		 * String[]{"111","222","333"}} ���򽫱� java.lang.IllegalArgumentException:
		 * wrong number of arguments
		 */
		method.invoke(null, (Object) new String[] { "111", "222", "333" });
	}
	public static void main(String[] args) throws Exception {

		//testReflectConstructor();

		testFiled();
		testReflectMethod();

	}

	private static void changStringValue(Object obj)
			throws IllegalArgumentException, IllegalAccessException {

		// �õ� obj �������е������ֶ�
		Field[] fields = obj.getClass().getFields();
		for (Field field : fields) {
			if (field.getType() == String.class) {
				// �õ� obj �����ϵ� filed �ֶε�ֵ
				String oldStrValue = (String) field.get(obj);
				// �滻 obj �����ϵ� filed �ֶε�ֵ
				String newStrValue = oldStrValue.replace('s', 'H');
				field.set(obj, newStrValue);
			}
		}
	}
}

class User {
	public String name1 = "zhangsan";
	public String name2 = "lisi";
	public String name3 = "wangwu";

	public int x;
	private int y;

	public User() {
	}

	public User(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return name1 + ":" + name2 + ":" + name3;
	}

	public static void main(String[] args) {
		for (String string : args) {
			System.out.println(string);
		}
	}

}
