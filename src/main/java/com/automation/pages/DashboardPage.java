package com.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DashboardPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Locator strategy improved for better maintainability
    @FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[2]/div[1]/div/div[1]/button[1]")
    private WebElement SOCIALSCIENCE9A;
    
   

    @FindBy(xpath = "//html/body/div/div[2]/div[3]/div/div[2]/div[1]/div/div[1]/button[2]")
    private WebElement SOCIALSCIENCE9B;

    @FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[2]/div[1]/div/div[1]/button[3]")
    private WebElement SOCIALSCIENCE9C;

    @FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[2]/div[1]/div/div[1]/button[4]")
    private WebElement SOCIALSCIENCE9D;
    //To DO list
    @FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[1]/div[2]")
    private WebElement clickAddbutton;
    //Description
    @FindBy(xpath = "/html/body/div/div[2]/aside[2]/div[2]/nav/div[2]/div[1]/div/textarea")
    private WebElement AddDescription;
    
    @FindBy(xpath = "/html/body/div/div[2]/aside[2]/div[1]/span")
    private WebElement clickonsetbutton;
	private By drawerToggle = By.id("drawer-toggle");

    @FindBy(xpath = "//div[@id='student-learning']")
    private WebElement Studentlearning;

   
    
    
    //
    
    
    
    

    // Constructor to initialize WebDriver and WebDriverWait
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Modern WebDriverWait initialization
    }
    // Click Methods
    public void clickSocialScience9A() {
        wait.until(ExpectedConditions.elementToBeClickable(SOCIALSCIENCE9A)).click();
    }

    public void clickSocialScience9B() {
        wait.until(ExpectedConditions.elementToBeClickable(SOCIALSCIENCE9B)).click();
    }

    public void clickSocialScience9C() {
        wait.until(ExpectedConditions.elementToBeClickable(SOCIALSCIENCE9C)).click();
    }

   
    public void clickSocialScience9D() {
        wait.until(ExpectedConditions.elementToBeClickable(SOCIALSCIENCE9D)).click();
    }
    public void clickAddbutton() {
        wait.until(ExpectedConditions.elementToBeClickable(clickAddbutton)).click();
    }
    public void addDescription(String description) {
        wait.until(ExpectedConditions.visibilityOf(AddDescription)).clear();
        AddDescription.sendKeys(description);
       // clickonsetbutton.click();
        wait.until(ExpectedConditions.visibilityOf(AddDescription));
    }

    // Check if the description was successfully saved
    public boolean isDescriptionSaved() {
        return wait.until(ExpectedConditions.visibilityOf(AddDescription)).isDisplayed();
    }
    public void clickonsetbutton() {
        wait.until(ExpectedConditions.elementToBeClickable(clickonsetbutton)).click();
    }
    public void toggleDrawer() throws InterruptedException {
		WebElement drawerToggleElement = wait.until(ExpectedConditions.elementToBeClickable(drawerToggle));
		drawerToggleElement.click();
		System.out.println("Toggled the drawer");
		Thread.sleep(1000);

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
    }
    
