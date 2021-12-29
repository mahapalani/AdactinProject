package com.Logger;

import org.apache.log4j.BasicConfigurator;

public class Logger {
// Factory Design Pattern
	static  org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Logger.class);
		public static void main(String[] args) {
			BasicConfigurator.configure();
		log.debug("debug");
		log.info("Information");
		log.warn("warn");
		log.error("error");
		log.fatal("fatal");
		
		
		}		
		
}
		