package generic;

public class GenericArray<T> {

	public void arr(){
		//不可创建不可具体化的类型的的数组
		//每当写用数组支持的泛型时都会出现这种问题
		//T[] e  = new T[5];//Cannot create a generic array of T
		//第一种解决办法-创建一个Object数组，并将它转换成泛型数组类型
		@SuppressWarnings("unchecked")
		T[] e  = (T[]) new Object[5];//此时编译器会产生警告Type safety: Unchecked cast from Object[] to T[]
		System.out.println("T:"+e.getClass().getName());
		//这用法虽然是合法的但不是类型安全的
		//
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericArray<String> g = new GenericArray<String>();
		g.arr();
	}

}
