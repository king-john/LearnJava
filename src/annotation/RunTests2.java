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
		// 获取annotation.Sample 类的class对象
		Class testClass = Class.forName("annotation.Sample2");
		// 通过反射获取类的方法
		for (Method m : testClass.getDeclaredMethods()) {
			if (m.isAnnotationPresent(ExceptionTest.class)) {
				// 有@Test注解的方法继续执行
				tests++;
				try {
					// 反射调用方法
					m.invoke(null);
					System.out.printf("Test %s failed:no exception%n", m);
				} catch (Throwable wrappedExc) {
					// 如果测试方法发生异常，则捕捉异常并打印报告
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
