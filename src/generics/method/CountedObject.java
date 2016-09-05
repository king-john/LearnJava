package generics.method;

public class CountedObject {

	private static long counter = 0;
	private final long id = counter++;
	public Long id() { return id;}
	public String toString() { return "CountedObject " + id;}

}
