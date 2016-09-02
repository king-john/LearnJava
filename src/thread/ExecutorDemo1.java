package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo1 {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R r1 = new R();
		R r2 = new R();
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(r1);
		executor.execute(r2);
	}

}
class R implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
	}
}

