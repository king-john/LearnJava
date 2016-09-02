package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		int tests = 0;
		int passed = 0;
		// ��ȡannotation.Sample ���class����
		Class testClass = Class.forName("annotation.Sample");
		// ͨ�������ȡ��ķ���
		for (Method m : testClass.getDeclaredMethods()) {
			if (m.isAnnotationPresent(Test.class)) {
				// ��@Testע��ķ�������ִ��
				tests++;
				try {
					// ������÷���
					m.invoke(null);
					passed++;
				} catch (InvocationTargetException wrappedExc) {
					// ������Է��������쳣����׽�쳣����ӡ����
					Throwable exc = wrappedExc.getCause();
					// excΪ���Է����׳���ԭʼ�쳣 ͨ��getCause()��ȡ
					System.out.println(m + "failed:" + exc);
				} catch (Exception exc) {
					// �׳�InvocationTargetException֮����쳣
					// ����������û�в�׽Testע�����Ч�÷���������ʵ�������ϵ�ע�⡢
					// ����һ����������������ע�⣬���߲��ɷ��ʵķ�����ע��
					System.out.println("INVALID @Test" + m);
				}

			}
		}
		System.out.printf("Passed: %d,Failed:%d%n", passed, tests - passed);
		System.out.println("--------------------------------------");
		for (Method m : testClass.getDeclaredMethods()) {
			try {
				m.invoke(testClass.newInstance());
				System.out.println(m+" suuccess");
			} catch (Exception e) {

				System.out.println(m + "fail :" + e);
			}
		}
	}

}
