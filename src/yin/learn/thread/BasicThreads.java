package yin.learn.thread;

public class BasicThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t =new Thread(new LiftOff());
		t.start();
		System.out.println("Waiting for LiftOff");
	}

}
