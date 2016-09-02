package reflect;

public class unknown {
	private String zero;
	
	private String two;
	
	private String three;

	
	public unknown(String zero, String two, String three) {
		super();
		this.zero = zero;
		this.two = two;
		this.three = three;
	}

	public String getZero() {
		return zero;
	}

	public void setZero(String zero) {
		this.zero = zero;
	}

	public String getTwo() {
		return two;
	}

	public void setTwo(String two) {
		this.two = two;
	}

	public String getThree() {
		return three;
	}

	public void setThree(String three) {
		this.three = three;
	}

	@Override
	public String toString() {
		return "unknown [zero=" + zero + ", two=" + two + ", three=" + three
				+ "]";
	}
	
	
}
