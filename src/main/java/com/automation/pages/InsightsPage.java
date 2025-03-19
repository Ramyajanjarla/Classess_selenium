package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class InsightsPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    // WebElement for 'Click on Insights' button
    @FindBy(xpath = "/html/body/div[1]/div[2]/aside[1]/div[1]/section[2]/div/div/div/div[1]/a[5]/span[2]")
    private WebElement clickOnInsights;

    // WebElement for 'Select Social Science 9A'
    @FindBy(xpath = "/html/body/div[1]/div[2]/aside[2]/aside/div/div[2]/div/div[2]/nav/a[1]")
    private WebElement select9ASocialScience;

    // WebElement for 'Click on Practice Details'
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[7]/div")
    private WebElement clickOnPracticeDetails;
    
    @FindBy(xpath="/html/body/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[3]/aside[1]/div/div[1]/div/i")
    private WebElement Learningdchapterdropdown;

    // Constructor for initializing elements
    public InsightsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    // Method to click on 'Insights' button
    public void clickOnInsights() {
        wait.until(ExpectedConditions.elementToBeClickable(clickOnInsights));
        clickOnInsights.click();
    }

    // Method to select 'Social Science 9A'
    public void select9ASocialScience() {
        wait.until(ExpectedConditions.elementToBeClickable(select9ASocialScience));
        select9ASocialScience.click();
    }

    // Method to click on 'Practice Details'
    public void clickOnPracticeDetails() {
        wait.until(ExpectedConditions.elementToBeClickable(clickOnPracticeDetails));
        clickOnPracticeDetails.click();
    }

    // Method to verify if Insights page is opened
    public void verifyInsightsPageOpened() {
        wait.until(ExpectedConditions.titleContains("Insights"));
        Assert.assertTrue(driver.getTitle().contains("Insights"), "The Insights page was not opened successfully.");
    }

    // Method to perform a series of actions
    public void performActions() {
        // Example of clicking on Insights and selecting Social Science 9A
        clickOnInsights();
        select9ASocialScience();
        clickOnPracticeDetails();
    }
    
    public void scrollToElement(By elementLocator) throws InterruptedException {
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
    
    // Method to click on 'Practice Details'
    public void Learningdchapterdropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(Learningdchapterdropdown));
        Learningdchapterdropdown.click();
    }

    
}
