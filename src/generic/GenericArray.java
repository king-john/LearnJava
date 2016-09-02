package generic;

public class GenericArray<T> {

	public void arr(){
		//���ɴ������ɾ��廯�����͵ĵ�����
		//ÿ��д������֧�ֵķ���ʱ���������������
		//T[] e  = new T[5];//Cannot create a generic array of T
		//��һ�ֽ���취-����һ��Object���飬������ת���ɷ�����������
		@SuppressWarnings("unchecked")
		T[] e  = (T[]) new Object[5];//��ʱ���������������Type safety: Unchecked cast from Object[] to T[]
		System.out.println("T:"+e.getClass().getName());
		//���÷���Ȼ�ǺϷ��ĵ��������Ͱ�ȫ��
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
