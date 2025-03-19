package com.Automationframeworktest;

import com.automation.pages.AssignmentsPage;
import com.automation.pages.ClassessPage;
import com.automation.pages.DashboardPage;
import com.automation.pages.LoginPage;
import com.automationframework.ExtentManager;
import com.automationframework.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class ClassessPageTest extends TestBase {
	private LoginPage loginPage;
	private ClassessPage classessPage;

	@BeforeClass
	public void setUpTest() {
		extent = ExtentManager.getInstance(); // Initialize ExtentReports
		loginPage = new LoginPage(driver);

		// Perform login with valid credentials
		loginPage.login("harshvardhan.chatterjee@email.com", "classess123");

		String expectedURL = "https://classess.com/classess/teacher-dashboard2?msg=success";

		// Verify that login was successful by checking the URL
		Assert.assertEquals(driver.getCurrentUrl(), expectedURL, "Login failed with valid credentials");

		classessPage = new ClassessPage(driver); // Initialize the AssignmentsPage
	}

	@Test(priority = 1)

	public void testClickOnClassesPageLink() throws InterruptedException, IOException {
		classessPage.clickOnClassesPageLink();
		// Add assertions to verify the next page or action
		// For example:
		// assertTrue(driver.getCurrentUrl().contains("classes"));
	}

	@Test(priority = 2)

	public void testClickOnLesson() throws InterruptedException, IOException {
		classessPage.clickOnLesson();
		// Add assertions as needed
		Thread.sleep(1000);

	}
//	@Test(priority = 3)
//	public void scrollToElement() throws InterruptedException {
//	    // Scroll to the specified element
//	    classessPage.scrollToElement1(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div[2]/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[3]/div[4]/div[2]/div"));
//	    // You can also add an explicit wait here to ensure the element is fully loaded before interacting with it
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div[2]/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[3]/div[4]/div[2]/div")));
//	    Thread.sleep(2000);  // Optional, only for visual verification
//	}
//
//	@Test(priority = 4)
//	public void scrolldown() {
//	    // Scroll down by 500px, 10 times with a wait in between
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//	    for (int i = 0; i < 10; i++) {  // Number of times you want to scroll down
//	        js.executeScript("window.scrollBy(0, 500)");  // Scrolls by 500px down
//	        try {
//	            Thread.sleep(2000);  // Wait for 2 seconds before the next scroll (use WebDriverWait for better handling)
//	        } catch (InterruptedException e) {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//
//	@Test(priority = 5)
//
//	public void testViewQuizButton() throws InterruptedException, IOException {
//		classessPage.viewQuizButton();
//		// Add assertions as needed
//	}
//
//	
//
//	@Test(priority = 6)
//
//	public void testViewQuizClose() throws InterruptedException, IOException {
//		classessPage.viewQuizclose();
//		// Add assertions as needed
//	}

	

	@Test(priority = 3)

	public void testMicOn() throws InterruptedException, IOException {
		classessPage.micon();
		// Add assertions as needed
	}

	@Test(priority = 4)

	public void testMicOff() throws InterruptedException, IOException {
		classessPage.micoff();
		// Add assertions as needed
	}
	@Test(priority = 5)
	public void scrollToElement() throws InterruptedException {
	    // Scroll to the specified element
	    classessPage.scrollToElement1(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div[2]/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[3]/div[4]/div[2]/div"));
	    // You can also add an explicit wait here to ensure the element is fully loaded before interacting with it
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div[2]/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[3]/div[4]/div[2]/div")));
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

	public void testViewQuizButton() throws InterruptedException, IOException {
		classessPage.viewQuizButton();
		// Add assertions as needed
	}

	

	@Test(priority = 8)

	public void testViewQuizClose() throws InterruptedException, IOException {
		classessPage.viewQuizclose();
		// Add assertions as needed
	}

	
	@Test(priority = 9)

	public void testClickNextButton() throws InterruptedException, IOException {
		classessPage.clickNextButton();
		// Add assertions as needed
	}

//	@Test(priority = 10)
//
//	public void testBackButton() throws InterruptedException, IOException {
//		classessPage.Back();
//		// Add assertions as needed
//	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
		ExtentManager.flushReports(); // ✅ Flush Extent Reports
	}
}
