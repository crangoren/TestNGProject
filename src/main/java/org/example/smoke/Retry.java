package org.example.smoke;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class Retry implements IRetryAnalyzer {

    private int actualRetry = 0;
    private static final int MAX_RETRIES = 3;


    @Override
    public boolean retry(ITestResult iTestResult) {
        if(actualRetry < MAX_RETRIES) {
            actualRetry++;
            return true;
        } else {
            return false;
        }
    }
}
