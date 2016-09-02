package generic;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<E> {
	//private E[] elements;
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	public Stack (){
		//不可创建不可具体化的类型的的数组
		//每当写用数组支持的泛型时都会出现这种问题 Cannot create a generic array of E
		//elements = new E[DEFAULT_INITIAL_CAPACITY];
		//第一种解决办法-创建一个Object数组，并将它转换成泛型数组类型
		//elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
		//此时编译器会产生警告:Type safety: Unchecked cast from Object[] to E[]
		//这用法虽然是合法的但不是类型安全的
		
		//第二种解决办法 将elements域的类型从E[] 改成  Object[]
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
		//但是会出现一条不同的错误
		//elements[--size] 处  Type mismatch: cannot convert from Object to E
		//解决办法将数组中获取到的元素从Object转成,这样错误就变成了一条警告
		//两种方式 第一种比第二种更危险，但是在更加实际的泛型类中，获取嗲吗中会有许多地方需要从数组中地区元素
		//因此第二种方式需要多次将元素转换成E,但是第一种只需转换成E[] 所以第一种方式可能更常见
	}
	public void push(E e){
		elements[size++] = e;
		ensureCapacity();
	}
	
	public E pop(){
		if(size == 0)
			throw new EmptyStackException();
		@SuppressWarnings("unchecked")
		E result = (E) elements[--size];
		elements[size] = null;
		return result;
	}
	
	public boolean isEmpty(){
		
		return size == 0;
	}
	
	private void ensureCapacity(){
		if(elements.length == size)
			elements = Arrays.copyOf(elements, 2*size +1);
	}
	public static void main(String[] args){
		Stack<String> stack = new Stack<String>();
		for(String arg :args)
			stack.push(arg);
		while(!stack.isEmpty())
			System.out.println(stack.pop().toUpperCase());
	}
}
