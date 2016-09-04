package exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class loggingExceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try { 
			throw new LoggingException();
		}catch(LoggingException e) {
			System.err.println("catch"+e);
		}
		try { 
			throw new LoggingException();
		}catch(LoggingException e) {
			System.err.println("catch"+e);
		}
	}

}
class LoggingException extends Exception { 
	private static Logger logger =Logger.getLogger("LoggingException");
	public LoggingException() {
		StringWriter trace = new StringWriter();	
		printStackTrace(new PrintWriter(trace)); 
		logger.severe(trace.toString());
		
	}
}
 