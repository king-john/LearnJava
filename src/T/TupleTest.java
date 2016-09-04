package T;



class Amphibian {}
class Vehicle {}
public class TupleTest {
	static TwoTuple<String,Integer > f() {
		// Autoboxfng converts the int to Integer:
		return new TwoTuple<String,Integer>("hi",47);
	}
	static ThreeTuple<Amphibian, String, Integer> g(){ 
		return new ThreeTuple<Amphibian, String, Integer>( new Amphibian(), "hi", 47);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoTuple<String,Integer > ttsi = f();
		System.out.println(ttsi);
		//ttsi.first = "there";// Compile error: final
		System.out.println(g());
	}

}
