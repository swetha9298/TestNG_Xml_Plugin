package listener.testing;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Custom_listener_interface implements ITestListener {

    public void onStart(ITestContext context) {
        System.out.println("Test execution started...");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Test execution finished...");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: " + result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Failure but within success percentage: " + result.getName());
    }
}