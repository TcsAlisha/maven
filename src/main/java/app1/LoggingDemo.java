package app1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
	private static Logger Logger = LogManager.getLogger(LoggingDemo.class);
	public static void main(String[] args) {
		//System.out.println();
		Logger.fatal("Fatal message");
		Logger.warn("This is warning");
		Logger.info("This is Info");
		Logger.trace("Trace message");
		Logger.debug("This is a debug message");
		Logger.error("Error");
	}
}
