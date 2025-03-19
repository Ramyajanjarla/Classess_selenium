package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class AssignmentsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "/html/body/div/div[2]/aside[1]/div[1]/section[2]/div/div/div/div[1]/a[3]/span[2]")
    private WebElement assignmentsTab;

    @FindBy(xpath = "/html/body/div[1]/div[4]/aside[2]/aside/div/div[2]/div[1]/div[2]/nav/a[1]")
    private WebElement SocialScience9A;
    
    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div/div[4]/div[2]/div[1]/div/div/div[1]/button/i")
    private WebElement clickHomeworkDropdown;
    
    @FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div/div[4]/div[2]/div[1]/div/div/div[2]/table/tbody/tr[1]/td[6]/div/i")
    private WebElement viewstudenthomework;
    
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/a/i")
    private WebElement closeview;
    
    @FindBy(xpath = "//button[@id='assgnbtn1']")
    private WebElement AssignHomeworkbutton;
    
    
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div/ul/li/input")
    private WebElement ClickonTopic;
    
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/ul/li[2]")
    private WebElement EnterTopics;
    @FindBy(xpath = "    /html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[3]/div/input")
    private WebElement NoHomeworkfor90;
    
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div/div[3]/div[1]/div/div[2]/div/div[1]/select")
    private WebElement selectquestiontype;
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div/div[3]/div[1]/div/div[3]/div/button/span")
    private WebElement AddQuestiontypeMultipleChoice;
    
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[5]/div/div/div[2]/div/div")
    private WebElement Stratified;
    
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[5]/div/div/div[3]/div/div")
    private WebElement Adaptive;
    
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[4]/div[2]/div/label[2]")
    private WebElement clickonSubjective;
    
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/input")
    private WebElement Marksenter;
   
    @FindBy(xpath ="/html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[3]/div/input")
    private WebElement idealAnswer;
    
    @FindBy(xpath ="/html/body/div/div[2]/div/div/div/form/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[5]/input")
    private WebElement AttachRubrics;
    //
   @FindBy(xpath ="/html/body/div/div[2]/aside[2]/aside/div/div[2]/div[2]/div[2]/nav/a/span")
    private WebElement  ClickRubricslink;
    @FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/form/div/div[3]/div/div/div/div/div/div[1]/div[1]/a/span")
    private WebElement cliknewRubricTemplate;
    
    @FindBy(xpath="/html/body/div/div[1]/div[1]")
    private WebElement ClickonRubricbackbutton;
    
    
    
  
    
    
    
    

    @FindBy(xpath = "//label[@id='btnProject']")
    private WebElement projectButton;
    
    
    

    @FindBy(xpath = "//label[@id='btnquiz']")
    private WebElement quizButton;

    @FindBy(xpath = "//button[contains(text(),'Assign Homework')]")
    private WebElement assignHomeworkButton;

    // Constructor
    public AssignmentsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // Click Assignments Tab
    public void clickAssignmentsTab() {
        wait.until(ExpectedConditions.elementToBeClickable(assignmentsTab));
        Assert.assertNotNull(assignmentsTab, "Assignments tab not found!");
        assignmentsTab.click();
    }

    // Click Homework
    public void SocialScience9A() {
        wait.until(ExpectedConditions.elementToBeClickable(SocialScience9A));
        Assert.assertNotNull(SocialScience9A, "Homework button not found!");
        SocialScience9A.click();
    }

    // Click Homework
    public void clickHomeworkDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(clickHomeworkDropdown));
        Assert.assertNotNull(clickHomeworkDropdown, "clickHomeworkDropdown button not found!");
        clickHomeworkDropdown.click();
    }

    // Click Homework
    public void viewstudenthomework() {
        wait.until(ExpectedConditions.elementToBeClickable(viewstudenthomework));
        Assert.assertNotNull(viewstudenthomework, "viewstudenthomework button not found!");
        viewstudenthomework.click();
    }

    // Click Assign Homework using Actions
    public void closeview() {
        wait.until(ExpectedConditions.elementToBeClickable(closeview));
        Assert.assertNotNull(closeview, "Assign Homework button not found!");
        new Actions(driver).moveToElement(closeview).click().perform();
    }
    // Click Homework
    public void AssignHomeworkbutton() {
        wait.until(ExpectedConditions.elementToBeClickable(AssignHomeworkbutton));
        Assert.assertNotNull(AssignHomeworkbutton, "viewstudenthomework button not found!");
        AssignHomeworkbutton.click();
    }

    
//    // Click Assign Homework using Actions
//    public void AssignHomeworkbutton() {
//        wait.until(ExpectedConditions.elementToBeClickable(AssignHomeworkbutton));
//        Assert.assertNotNull(AssignHomeworkbutton, "Assign Homework button not found!");
//        new Actions(driver).moveToElement(AssignHomeworkbutton).click().perform();
//    }
//    /////////////
 // Click Assign Homework using Actions
    public void ClickonTopic() {
        wait.until(ExpectedConditions.elementToBeClickable(ClickonTopic));
        Assert.assertNotNull(assignHomeworkButton, "Assign Homework button not found!");
        new Actions(driver).moveToElement(ClickonTopic).click().perform();
    }
    
 // Click Assign Homework using Actions
    public void EnterTopics() {
        wait.until(ExpectedConditions.elementToBeClickable(EnterTopics));
        Assert.assertNotNull(assignHomeworkButton, "Assign Homework button not found!");
        new Actions(driver).moveToElement(EnterTopics).click().perform();
    }
    
    
    public void NoHomeworkfor90() {
        wait.until(ExpectedConditions.elementToBeClickable(EnterTopics));
        Assert.assertNotNull(assignHomeworkButton, "Assign Homework button not found!");
        new Actions(driver).moveToElement(NoHomeworkfor90).click().perform();
    }
 // Click Assign Homework using Actions
    public void selectquestiontype() {
        wait.until(ExpectedConditions.elementToBeClickable(selectquestiontype));
        Assert.assertNotNull(assignHomeworkButton, "Assign Homework button not found!");
        new Actions(driver).moveToElement(selectquestiontype).click().perform();
    }
    
 // Click Assign Homework using Actions
    public void AddQuestiontypeMultipleChoice() {
        wait.until(ExpectedConditions.elementToBeClickable(AddQuestiontypeMultipleChoice));
        Assert.assertNotNull(AddQuestiontypeMultipleChoice, "Assign Homework button not found!");
        new Actions(driver).moveToElement(AddQuestiontypeMultipleChoice).click().perform();
    }
    
    
 // Click Stratified using Actions
    public void clickStratified() {
        wait.until(ExpectedConditions.elementToBeClickable(Stratified));
        Assert.assertNotNull(Stratified, "Stratified element not found!");
        new Actions(driver).moveToElement(Stratified).click().perform();
    }

    // Click Adaptive using Actions
    public void clickAdaptive() {
        wait.until(ExpectedConditions.elementToBeClickable(Adaptive));
        Assert.assertNotNull(Adaptive, "Adaptive element not found!");
        new Actions(driver).moveToElement(Adaptive).click().perform();
    }

    // Click on Subjective using Actions
    public void clickOnSubjective() {
        wait.until(ExpectedConditions.elementToBeClickable(clickonSubjective));
        Assert.assertNotNull(clickonSubjective, "Subjective element not found!");
        new Actions(driver).moveToElement(clickonSubjective).click().perform();
    }

    // Method to interact with Marksenter, e.g., entering marks
    public void enterMarks(String marks) {
        Marksenter.clear(); // Clear existing value
        Marksenter.sendKeys(marks); // Send new value
    }
    // Click Ideal Answer using Actions
    public void clickIdealAnswer() {
        wait.until(ExpectedConditions.elementToBeClickable(idealAnswer));
        Assert.assertNotNull(idealAnswer, "Ideal Answer element not found!");
        new Actions(driver).moveToElement(idealAnswer).click().perform();
    }

    public void AttachRubrics() {
        wait.until(ExpectedConditions.elementToBeClickable(AttachRubrics));
        Assert.assertNotNull(AttachRubrics, "Ideal Answer element not found!");
        new Actions(driver).moveToElement(AttachRubrics).click().perform();
    }
    
   
    // Attach Rubrics using Actions
    public void clickAttachRubrics() {
        wait.until(ExpectedConditions.elementToBeClickable(AttachRubrics));
        Assert.assertNotNull(AttachRubrics, "Attach Rubrics element not found!");
        new Actions(driver).moveToElement(AttachRubrics).click().perform();
    }

    
    
 
    public void ClickRubricslink() {
        wait.until(ExpectedConditions.elementToBeClickable(ClickRubricslink));
        Assert.assertNotNull(ClickRubricslink, "Assign Homework button not found!");
        new Actions(driver).moveToElement(ClickRubricslink).click().perform();
    }
    
   
    public void cliknewRubricTemplate() {
        wait.until(ExpectedConditions.elementToBeClickable(cliknewRubricTemplate));
        Assert.assertNotNull(cliknewRubricTemplate, "Assign Homework button not found!");
        new Actions(driver).moveToElement(cliknewRubricTemplate).click().perform();
    }
    public void ClickonRubricbackbutton() {
        wait.until(ExpectedConditions.elementToBeClickable(ClickonRubricbackbutton));
        Assert.assertNotNull(ClickonRubricbackbutton, "Assign Homework button not found!");
        new Actions(driver).moveToElement(ClickonRubricbackbutton).click().perform();
    }
    
    
    
    
    
}
