package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class TestDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println();DateUtil.dateToTimestamp(new Date()).toString();
		
		SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ); 
		try {
			Date date = sdf.parse("2015-12-07 15:21:59");
			System.out.println(date.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
