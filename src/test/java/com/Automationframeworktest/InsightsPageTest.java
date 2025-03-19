package com.Automationframeworktest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.pages.DashboardPage;
import com.automation.pages.InsightsPage;
import com.automation.pages.LoginPage;
import com.automationframework.TestBase;
import com.automationframework.ExtentManager;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class InsightsPageTest extends TestBase {

    // WebDriver instance
    private LoginPage loginPage;

    private InsightsPage insightsPage;
    private WebDriverWait wait;
    private ExtentTest test;

    @BeforeClass
    public void setUpTest() {
        extent = ExtentManager.getInstance();  // ✅ Initialize ExtentReports
        loginPage = new LoginPage(driver);
        loginPage.login("harshvardhan.chatterjee@email.com", "classess123");

        String expectedURL = "https://classess.com/classess/teacher-dashboard2?msg=success";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL, "Login failed with valid credentials");

        insightsPage = new InsightsPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void testClickOnInsights() {
        // Action: Click on 'Insights' button
        insightsPage.clickOnInsights();
        
        // Verify: Check if the Insights page is opened (example assertion on page title)
        insightsPage.verifyInsightsPageOpened();
    }

    @Test(priority = 2)
    public void testSelectSocialScience9A() {
        // Action: Select 'Social Science 9A'
        insightsPage.select9ASocialScience();
        
        // Verify: Assert that after clicking the 'Social Science 9A', the page title is updated correctly
        // This is an example, you can verify other elements on the page as needed
        String expectedTitle = "Social Science 9A"; // Replace with the actual expected title
        Assert.assertTrue(driver.getTitle().contains(expectedTitle), "Title doesn't contain 'Social Science 9A'");
    }

    @Test(priority = 3)
    public void testClickOnPracticeDetails() throws InterruptedException {
        // Action: Click on 'Practice Details'
        insightsPage.clickOnPracticeDetails();
         Thread.sleep(10000);
    }

    @Test(priority = 5)
	public void scrollToElement() throws InterruptedException {
	    // Scroll to the specified element
    	insightsPage.scrollToElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[3]/aside[2]/div/div[1]/div"));
	    Thread.sleep(2000);  // Optional, only for visual verification
	}

	@Test(priority = 6)
	public void scrolldown() {
	    // Scroll down by 500px, 10 times with a wait in between
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    for (int i = 0; i < 10; i++) {  // Number of times you want to scroll down
	        js.executeScript("window.scrollBy(0, 500)");  // Scrolls by 500px down
	        try {
	            Thread.sleep(2000);  // Wait for 2 seconds before the next scroll (use WebDriverWait for better handling)
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}
    @Test(priority = 7)
    public void Learningdchapterdropdown() {
        insightsPage.Learningdchapterdropdown();

    }
    
    @AfterClass
    public void tearDown() {
        // Close the browser after all tests are done
        driver.quit();
    }
}