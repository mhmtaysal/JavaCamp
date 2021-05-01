package interfaces;

public class Utils {
	
	public static void runLogers(Logger[] loggers,String message) {
		for (Logger logger:loggers) {
			logger.log(message);
		}
		}
	}

