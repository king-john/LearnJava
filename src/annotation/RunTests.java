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
		// 获取annotation.Sample 类的class对象
		Class testClass = Class.forName("annotation.Sample");
		// 通过反射获取类的方法
		for (Method m : testClass.getDeclaredMethods()) {
			if (m.isAnnotationPresent(Test.class)) {
				// 有@Test注解的方法继续执行
				tests++;
				try {
					// 反射调用方法
					m.invoke(null);
					passed++;
				} catch (InvocationTargetException wrappedExc) {
					// 如果测试方法发生异常，则捕捉异常并打印报告
					Throwable exc = wrappedExc.getCause();
					// exc为测试方法抛出的原始异常 通过getCause()获取
					System.out.println(m + "failed:" + exc);
				} catch (Exception exc) {
					// 抛出InvocationTargetException之外的异常
					// 表明编译器没有捕捉Test注解的无效用法，例如在实例方法上的注解、
					// 带有一个或多个参数方法的注解，或者不可访问的方法的注解
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
