package com.automationframework;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    // Singleton pattern to return only one instance of ExtentReports
    public static synchronized ExtentReports getInstance() {
        if (extent == null) {
            initReport();
        }
        return extent;
    }

    // Initialize Extent Reports
    private static void initReport() {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    // Create a new test in the report
    public static synchronized ExtentTest createTest(String testName) {
        if (extent == null) {
            getInstance();  // Ensure ExtentReports is initialized
        }
        ExtentTest extentTest = extent.createTest(testName);
        test.set(extentTest);
        return extentTest;
    }

    // Get the current test instance
    public static ExtentTest getTest() {
        return test.get();
    }

    // Flush the report at the end of execution
    public static synchronized void flushReports() {
        if (extent != null) {
            extent.flush();
        }
        test.remove(); // Prevent memory leaks
    }
}
