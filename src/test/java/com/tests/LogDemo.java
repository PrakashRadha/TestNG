package com.tests;

import Utilities.BaseClass;

public class LogDemo extends BaseClass{

	public static void main(String[] args) {
		logger.info("It is info message");
		logger.error("Itis error message");
		logger.fatal("It is fatal message");
		logger.warn("It is warning message");
	
	}
}
