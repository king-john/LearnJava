package generics.coffee;

import java.util.Iterator;
import java.util.Random;

import net.mindview.util.Generator;

public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {
	private Class[] types = { Latte.class,Mocha.class, Cappuccino.class, Americano.class, Breve.class  };
	private static Random rand = new Random(47); 
	public CoffeeGenerator() {}//构造器
	// For iteration: 
	private int size = 0;
	public CoffeeGenerator(int sz) { size = sz; } //构造器
	public Coffee next() { 
		try {
			//生成一个Coffee对象
			return (Coffee)
			types[rand.nextInt(types.length)].newInstance();//取一个class类并实例化
			// Report programnier errors at run time:
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	class CoffeeIterator implements Iterator<Coffee> { 
		int count = size;
		public boolean hasNext() { return count > 0; } 
		//返回当前元素，并指向下一个元素
		public Coffee next() { 
			count--;
			return CoffeeGenerator.this.next();
		}
		public void remove() {
			// Not implernenteol 
			throw new UnsupportedOperationException();
		}
	}
	
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}
	
	
	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for(int i = 0; i < 5; i++)
			System.out.println(gen.next());
		for(Coffee c : new CoffeeGenerator(5))
			System.out.println(c);

	}

}
