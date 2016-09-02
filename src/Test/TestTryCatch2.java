package Test;

public class TestTryCatch2 {

	public static void chu(int i){
		//try {
			System.out.println(10/i);
			System.out.println("³ýÊýÎª"+i);
		//} catch (Exception e) {
			//System.out.println(e);
		//}
		System.out.println(i);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=5;i++){
			TestTryCatch2.chu(i);
		}
	}

}
