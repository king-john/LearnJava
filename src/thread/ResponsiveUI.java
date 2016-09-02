package thread;

import java.io.IOException;


public class ResponsiveUI extends Thread{
	
	private static volatile double d= 1;
	
	public ResponsiveUI(){
		//setDaemon(true);
		start();
	}
	@Override
	public void run() {
		d = d*2;
//		while(d>0){
//			d = d+(Math.PI+Math.E)/d;
//		}
	}
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new ResponsiveUI();
		System.in.read();
		System.out.println(d);
	}

}
