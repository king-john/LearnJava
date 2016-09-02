package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class HorseRace {
	
	static final int FINSH_LINE = 75;
	
	private List<Horse> horses = new ArrayList<Horse>();
	
	private ExecutorService exce = Executors.newCachedThreadPool();
	private CyclicBarrier barrier;
	public HorseRace(int nHorses,final int pause){
		barrier = new CyclicBarrier(nHorses, new Runnable() {
			
			@Override
			public void run() {
				StringBuilder s = new StringBuilder();
				for (int i=0;i<FINSH_LINE ;i++)
					s.append("=");
				System.out.println(s);
				for(Horse horse:horses)
					if(horse.getStrides() >= FINSH_LINE){
						System.out.println(horse+"won!");
						exce.shutdownNow();
						return;
					}
				try {
					TimeUnit.MILLISECONDS.sleep(pause);
				} catch (InterruptedException e) {
					System.out.println("barrier-action sleep interrupted");
				}
			}
		});
		for(int i=0;i<nHorses;i++){
			Horse horse = new Horse(barrier);
			horses.add(horse);
			exce.execute(horse);
		}
			
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nHorses = 7;
		int pause =200;
		new HorseRace(nHorses, pause);

	}

}

class Horse implements Runnable {

	private static int count = 0;
	private final int id = count++;
	private int strides = 0;
	private static Random rand = new Random(47);
	private static CyclicBarrier barrier;

	public Horse(CyclicBarrier b) {
		barrier = b;
	}

	public synchronized int getStrides() {
		return strides;
	}

	@Override
	public void run() {
		try {
			while(!Thread.interrupted()) {
				synchronized (this) {
					strides += rand.nextInt(3);
				}
				barrier.wait();
			}
		} catch (InterruptedException e) {
			
		} /*catch (BrokenBarrierException e) {
			throw new RuntimeException(e);
		}*/
	}
	
	public String toString(){
		return "horse"+id+" ";
	}
	
	public String tracks(){
		StringBuilder s = new StringBuilder();
		for(int i=0;i<getStrides();i++)
			s.append("*");
		s.append(id);
		return s.toString();
	}
	
	
}