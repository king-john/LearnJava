package Test;

import java.util.Calendar;

public class TestGetOutTime {
	public static int getOutTime() {

		Calendar cal = Calendar.getInstance();
		long thisTime = cal.getTimeInMillis();
//		System.out.println(thisTime);
		cal.add(Calendar.DATE, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		long dueTime = cal.getTimeInMillis();
//		System.out.println(dueTime);
		int outTime = (int)(dueTime - thisTime)/1000;
		return outTime;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getOutTime());
	}

}
