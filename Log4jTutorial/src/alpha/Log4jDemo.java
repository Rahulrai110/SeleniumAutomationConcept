package alpha;

import org.apache.logging.log4j.*;

public class Log4jDemo {

	
	private static Logger log = LogManager.getLogger(Log4jDemo.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		log.debug("I have click on Button");
		log.info("Button is displayed");
		log.error("Button is not present");
		log.fatal("Button is missing");
		}
		
		
	}

