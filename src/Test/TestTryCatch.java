package Test;

public class TestTryCatch {

	public static void chu(int i){
		try {
			System.out.println(10/i);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=5;i++){
			TestTryCatch.chu(i);
		}
	}

}
