package com.Automationframeworktest;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.automation.pages.LoginPage;
import com.automationframework.TestBase;
import com.automationframework.ExtentManager;
import com.aventstack.extentreports.Status;

public class LoginTest extends TestBase {

    @Test
    public void testValidLogin() {
        test = ExtentManager.createTest("Test Valid Login");
        try {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login("harshvardhan.chatterjee@email.com", "classess123"); 
            String expectedURL = "https://classess.com/classess/teacher-dashboard2?msg=success";
            Assert.assertEquals(driver.getCurrentUrl(), expectedURL, "Login failed with valid credentials");
            test.log(Status.PASS, "Valid login test passed successfully.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Test failed due to: " + e.getMessage());
            Assert.fail();
        }
    }
}
