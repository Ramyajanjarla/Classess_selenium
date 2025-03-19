package com.Automationframeworktest;

import com.automation.pages.DashboardPage;
import com.automation.pages.LoginPage;
import com.automationframework.TestBase;
import com.automationframework.ExtentManager;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class DashboardTest extends TestBase {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private WebDriverWait wait;
   // private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUpTest() {
        extent = ExtentManager.getInstance();  // ✅ Initialize ExtentReports
        loginPage = new LoginPage(driver);
        loginPage.login("harshvardhan.chatterjee@email.com", "classess123");

        String expectedURL = "https://classess.com/classess/teacher-dashboard2?msg=success";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL, "Login failed with valid credentials");

        dashboardPage = new DashboardPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void testClickSocialScience9A() {
        test = ExtentManager.createTest("DashboardTest - Click SocialScience9A");
        try {
            dashboardPage.clickSocialScience9A();
            wait.until(ExpectedConditions.urlContains("dashboard"));
            Assert.assertNotNull(dashboardPage);
            test.log(Status.PASS, "Successfully clicked SocialScience9A button");
        } catch (Exception e) {
            test.log(Status.FAIL, "Test failed: " + e.getMessage());
            Assert.fail();
        }
    }

    @Test(priority = 2)
    public void testClickSocialScience9B() {
        test = ExtentManager.createTest("DashboardTest - Click SocialScience9B");
        try {
            dashboardPage.clickSocialScience9B();
            wait.until(ExpectedConditions.urlContains("dashboard"));
            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Navigation failed!");
            test.log(Status.PASS, "Successfully clicked SocialScience9B button");
        } catch (Exception e) {
            test.log(Status.FAIL, "Test failed: " + e.getMessage());
            Assert.fail();
        }
    }

    @Test(priority = 3)
    public void testClickSocialScience9C() {
        test = ExtentManager.createTest("DashboardTest - Click SocialScience9C");
        try {
            dashboardPage.clickSocialScience9C();
            wait.until(ExpectedConditions.urlContains("dashboard"));
            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Navigation failed!");
            test.log(Status.PASS, "Successfully clicked SocialScience9C button");
        } catch (Exception e) {
            test.log(Status.FAIL, "Test failed: " + e.getMessage());
            Assert.fail();
        }
    }

    @Test(priority = 4)
    public void testClickSocialScience9D() {
        test = ExtentManager.createTest("DashboardTest - Click SocialScience9D");
        try {
            dashboardPage.clickSocialScience9D();
            wait.until(ExpectedConditions.urlContains("dashboard"));
            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Navigation failed!");
            test.log(Status.PASS, "Successfully clicked SocialScience9D button");
        } catch (Exception e) {
            test.log(Status.FAIL, "Test failed: " + e.getMessage());
            Assert.fail();
        }
    }

    @Test(priority = 5)
    public void ToDOList_clickAddbutton() {
        test = ExtentManager.createTest("DashboardTest - Click Add To-Do List Button");
        try {
            dashboardPage.clickAddbutton();
            wait.until(ExpectedConditions.urlContains("dashboard"));
            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Navigation failed!");
            test.log(Status.PASS, "Successfully clicked Add to-do list button");
        } catch (Exception e) {
            test.log(Status.FAIL, "Test failed: " + e.getMessage());
            Assert.fail();
        }
    }

    @Test(priority = 6)
    public void AddDescription_ForToDo() throws InterruptedException {
        test = ExtentManager.createTest("DashboardTest - Add Description to ToDo List");
        try {
            dashboardPage.addDescription("Learning outcomes");
            wait.until(ExpectedConditions.urlContains("dashboard"));

            dashboardPage.addDescription("Learning outcomes");
            dashboardPage.clickonsetbutton();

            test.log(Status.PASS, "Successfully added and set description");
        } catch (Exception e) {
            test.log(Status.FAIL, "Test failed: " + e.getMessage());
            Assert.fail();
            Thread.sleep(10000);
        }
    }
    @Test(priority = 7)

    public void scrollToElement() throws InterruptedException {
   

	dashboardPage.scrollToElement(By.xpath("//*[@id=\"myChart3\"]"));
    Thread.sleep(10000);
    
	}
    @Test(priority = 7)
    public void testScrollUp() throws InterruptedException {
    	dashboardPage.scrollToElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]"));
        Thread.sleep(10000);
        
    }
    @Test(priority = 8)
    public void Practice() throws InterruptedException {
    	dashboardPage.scrollToElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[2]/div/div[1]/div[1]/div/div/div[1]/div[2]/div/div/button[2]"));
        Thread.sleep(10000);
        
    }


    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        ExtentManager.flushReports();  // ✅ Flush Extent Reports
    }
}
