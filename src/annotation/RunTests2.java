package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests2 {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		int tests = 0;
		int passed = 0;
		// ��ȡannotation.Sample ���class����
		Class testClass = Class.forName("annotation.Sample2");
		// ͨ�������ȡ��ķ���
		for (Method m : testClass.getDeclaredMethods()) {
			if (m.isAnnotationPresent(ExceptionTest.class)) {
				// ��@Testע��ķ�������ִ��
				tests++;
				try {
					// ������÷���
					m.invoke(null);
					System.out.printf("Test %s failed:no exception%n", m);
				} catch (Throwable wrappedExc) {
					// ������Է��������쳣����׽�쳣����ӡ����
					Throwable exc = wrappedExc.getCause();

					Class<? extends Exception>[] excTypes = m.getAnnotation(
							ExceptionTest.class).value();
					int oldPassed = passed;
					for (Class<? extends Exception> excType : excTypes) {
						if (excType.isInstance(exc)) {
							passed++;
							break;
						}
					}
					if (oldPassed == passed) {
						System.out.printf("Test %s failed:excepted %s %n", m,
								exc);
					}
				}
			}
		}
		System.out.printf("Passed: %d,Failed:%d%n", passed, tests - passed);

	}

}
