package com.automation.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;


public class ClassessPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private static final Logger logger = LoggerFactory.getLogger(ClassessPage.class);

    // Define locators
    private By classesPageLink = By.xpath("/html/body/div/div[2]/aside[1]/div/section[2]/div/div/div/div[1]/a[2]");
    private By lessonLink = By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/a/div/div[3]/span");

    
  //  private By lessonLink = By.xpath("//span[contains(text(),'chevron_right')]");
    private By viewQuizButton = By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div[2]/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/div[3]/div[4]/div[2]/div/a[1]/span");
    private By viewQuizclose = By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div[2]/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/button");
    private By nextButton = By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/nav/div/div/div[2]/a/span/span");
    private By micon =  By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div/button[2]");
    private By micoff = By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div/button[1]");
    private By Back = By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[2]/div[1]/div[1]/div/a");

    // Constructor to initialize WebDriver and WebDriverWait
    public ClassessPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // Method to click on the Classes Page link
    public void clickOnClassesPageLink() throws InterruptedException, IOException {
        WebElement element = waitForElementToBeClickable(classesPageLink);
        element.click();
        logger.info("Clicked on Classes Page link");
        captureScreenshot("clickOnClassesPageLink");
        Thread.sleep(1000);
    }

    // Method to click on the lesson
    public void clickOnLesson() throws InterruptedException, IOException {
        WebElement element = waitForElementToBeClickable(lessonLink);
        element.click();
        logger.info("Clicked on lesson");
        captureScreenshot("clickOnLesson");
        Thread.sleep(1000);
    }
    public void scrollToElement1(By elementLocator) throws InterruptedException {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertTrue(element.isDisplayed(), "Element should be visible after scrolling");
		System.out.println("Scrolled to element: " + elementLocator.toString());
		Thread.sleep(1000);

	}
    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-500)"); // Adjust pixels as needed
    }
    // Method to view the quiz
    public void viewQuizButton() throws InterruptedException, IOException {
        WebElement element = waitForElementToBeClickable(viewQuizButton);
        element.click();
        logger.info("Clicked on view quiz");
        captureScreenshot("viewQuizButton");
        Thread.sleep(1000);
    }

    public void viewQuizclose() throws InterruptedException, IOException {
        WebElement element = waitForElementToBeClickable(viewQuizclose);
        element.click();
        logger.info("Clicked on view quiz close");
        captureScreenshot("viewQuizclose");
        Thread.sleep(1000);
    }

    // Method to click the next button
    public void clickNextButton() throws InterruptedException, IOException {
        WebElement element = waitForElementToBeClickable(nextButton);
        element.click();
        logger.info("Clicked on next button");
        captureScreenshot("clickNextButton");
    }

    public void micon() throws InterruptedException, IOException {
        WebElement element = waitForElementToBeClickable(micon);
        element.click();
        logger.info("Clicked on micon");
        captureScreenshot("micon");
        Thread.sleep(1000);
    }

    public void micoff() throws InterruptedException, IOException {
        WebElement element = waitForElementToBeClickable(micoff);
        element.click();
        logger.info("Clicked on micoff");
        captureScreenshot("micoff");
        Thread.sleep(1000);
    }

    public void Back() throws InterruptedException, IOException {
        WebElement element = waitForElementToBeClickable(Back);
        element.click();
        logger.info("Clicked on Back button");
        captureScreenshot("Back");
        Thread.sleep(1000);
    }

    // Private method to wait for an element to be clickable
    private WebElement waitForElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Method to capture screenshot
    private void captureScreenshot(String screenshotName) throws IOException {
    //    String screenshotPath = ScreenshotUtils.captureScreenshot(driver, screenshotName);
     //   logger.info("Screenshot taken: " + screenshotPath);
    }

	
}
