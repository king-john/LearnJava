package thread;

import java.util.concurrent.atomic.AtomicLong;

public class ThreadDemo5 {
	private static final AtomicLong nextSerialNum = new AtomicLong();
	
	public static long generateSerialNum(){
		return nextSerialNum.getAndIncrement();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true)
				{
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"--"+generateSerialNum());
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true)
				{
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					System.out.println(Thread.currentThread().getName()+"--"+generateSerialNum());
				}
			}
		});
		thread1.start();
		thread2.start();
	}

}
