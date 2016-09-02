package deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DeadlockingDiningPhilosophers {

	public static void main(String[] args) throws Exception {
		int ponder = 5;
		if(args.length >0)
			ponder = Integer.getInteger(args[0]);
		int size = 5;
		if(args.length >1)
			size = Integer.getInteger(args[1]);
		
		ExecutorService exce = Executors.newCachedThreadPool();
		Chopstick[] sticks = new Chopstick[size];
		for(int i =0;i<size;i++)
			sticks[i] = new Chopstick();
		
		for(int i=0;i<size;i++)
			exce.execute(new Philosopher(sticks[i], sticks[(i+1)%size], i, ponder));
		
		if(args.length ==3 && args[2].equals("timeout"))
			TimeUnit.SECONDS.sleep(5);
		else{
			System.out.println("Press 'Enter' to quit");
			System.in.read();
		}
		exce.shutdownNow();
	}

}
