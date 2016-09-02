package generic;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<E> {
	//private E[] elements;
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	public Stack (){
		//���ɴ������ɾ��廯�����͵ĵ�����
		//ÿ��д������֧�ֵķ���ʱ��������������� Cannot create a generic array of E
		//elements = new E[DEFAULT_INITIAL_CAPACITY];
		//��һ�ֽ���취-����һ��Object���飬������ת���ɷ�����������
		//elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
		//��ʱ���������������:Type safety: Unchecked cast from Object[] to E[]
		//���÷���Ȼ�ǺϷ��ĵ��������Ͱ�ȫ��
		
		//�ڶ��ֽ���취 ��elements������ʹ�E[] �ĳ�  Object[]
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
		//���ǻ����һ����ͬ�Ĵ���
		//elements[--size] ��  Type mismatch: cannot convert from Object to E
		//����취�������л�ȡ����Ԫ�ش�Objectת��,��������ͱ����һ������
		//���ַ�ʽ ��һ�ֱȵڶ��ָ�Σ�գ������ڸ���ʵ�ʵķ������У���ȡ�����л������ط���Ҫ�������е���Ԫ��
		//��˵ڶ��ַ�ʽ��Ҫ��ν�Ԫ��ת����E,���ǵ�һ��ֻ��ת����E[] ���Ե�һ�ַ�ʽ���ܸ�����
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
