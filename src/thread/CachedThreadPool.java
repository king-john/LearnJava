package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exce = Executors.newCachedThreadPool();
		for(int i=0;i<4;i++){
			exce.execute(new LiftOff());
		}
		exce.shutdown();
	}

}
