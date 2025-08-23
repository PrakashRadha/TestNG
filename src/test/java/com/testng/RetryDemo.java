package com.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryDemo implements IRetryAnalyzer{
	int retry = 0; // retry start count
	int count = 3; // max. number of retry
	@Override
	public boolean retry(ITestResult result) {
		if(retry<count) { // condition for retry
			retry++;  // incrementing retry count
			return true;
		}
		
		return false;
	}

}
