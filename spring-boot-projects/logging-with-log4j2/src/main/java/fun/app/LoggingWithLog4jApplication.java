package fun.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingWithLog4jApplication {
	private static final Logger logger = LogManager.getLogger(LoggingWithLog4jApplication.class);

	public static void main(String[] args) {
		logger.debug("Debugging log");
		logger.info("Info log");
		logger.warn("Hey, This is a warning!");
		logger.error("Oops! We have an Error. OK");
		logger.fatal("Damn! Fatal error. Please fix me.");

		SpringApplication.run(LoggingWithLog4jApplication.class, args);
	}

}
