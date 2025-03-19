package com.Automationframeworktest;

import com.automation.pages.AssignmentsPage;
import com.automation.pages.LoginPage;
import com.automationframework.TestBase;
import com.automationframework.ExtentManager;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.*;

public class AssignmentsTest extends TestBase {

    private LoginPage loginPage;
    private AssignmentsPage assignmentsPage;

    @BeforeClass
    public void setUpTest() {
        extent = ExtentManager.getInstance();  // Initialize ExtentReports
        loginPage = new LoginPage(driver);
        
        // Perform login with valid credentials
        loginPage.login("harshvardhan.chatterjee@email.com", "classess123");

        String expectedURL = "https://classess.com/classess/teacher-dashboard2?msg=success";
        
        // Verify that login was successful by checking the URL
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL, "Login failed with valid credentials");

        assignmentsPage = new AssignmentsPage(driver);  // Initialize the AssignmentsPage
    }

 // Test case 1: Open Assignments page and verify it's loaded
    @Test(priority = 1)
    public void testOpenAssignmentsPage() throws InterruptedException {
        // Clicking on the Assignments tab to open the page
        assignmentsPage.clickAssignmentsTab();
        Thread.sleep(1000);  // Consider using WebDriverWait for better synchronization
    }

    // Test case 2: Select Social Science for 9A class
    @Test(priority = 2)
    public void SocialScience9A() {
        // Selecting the Social Science subject for class 9A
        assignmentsPage.SocialScience9A();
    }

    // Test case 3: Click on Homework dropdown and wait for dropdown to load
    @Test(priority = 3)
    public void clickHomeworkDropdown() throws InterruptedException {
        // Clicking on the Homework dropdown to access available options
        assignmentsPage.clickHomeworkDropdown();
        Thread.sleep(10000);  // Consider replacing with a more reliable wait condition (e.g., WebDriverWait)
    }

    // Test case 4: View student homework
    @Test(priority = 4)
    public void viewStudentHomework() throws InterruptedException {
        // Viewing the homework assigned to students
        assignmentsPage.viewstudenthomework();
        Thread.sleep(1000);  // Short wait to ensure the page loads completely
    }

    // Test case 5: Close the view (view student homework or another section)
    @Test(priority = 6)
    public void closeView() throws InterruptedException {
        // Closing the current view (e.g., student homework or another section)
        assignmentsPage.closeview();
        Thread.sleep(1000);  // Short wait to ensure view is closed properly
    }

    // Test case 6: Click on Assign Homework button
    @Test(priority = 7)
    public void AssignHomeworkButton() throws InterruptedException {
        // Clicking on the 'Assign Homework' button to open the assignment options
        assignmentsPage.AssignHomeworkbutton();
        Thread.sleep(10000);  // Consider replacing with a more reliable wait condition
    }

    // Test case 7: Click on a specific topic in the assignments section
    @Test(priority = 8)
    public void ClickOnTopic() throws InterruptedException {
        // Clicking on a specific topic within the assignments section
        assignmentsPage.ClickonTopic();
        Thread.sleep(10000);  // Wait to ensure the topic loads fully
    }

    // Test case 8: Enter topics for the homework assignment
    @Test(priority = 9)
    public void EnterTopics() throws InterruptedException {
        // Entering the topics for the current homework assignment
        assignmentsPage.EnterTopics();
        Thread.sleep(1000);  // Short wait to ensure the topics are entered correctly
    }

    // Test case 9: Set "No Homework" for 90 students
    @Test(priority = 10)
    public void NoHomeworkFor90() throws InterruptedException {
        // Setting "No Homework" status for 90 students
        assignmentsPage.NoHomeworkfor90();
        Thread.sleep(1000);  // Short wait to ensure the status is set correctly
    }


 // Test case 10: Select a question type for the assignment
    @Test(priority = 11)
    public void selectQuestionType() throws InterruptedException {
        // Selecting the type of question to be used in the assignment
        assignmentsPage.selectquestiontype();
        Thread.sleep(1000);  // Short wait to ensure the question type is selected
    }

    // Test case 11: Add Multiple Choice question type
    @Test(priority = 12)
    public void AddQuestionTypeMultipleChoice() throws InterruptedException {
        // Adding a Multiple Choice question type to the assignment
        assignmentsPage.AddQuestiontypeMultipleChoice();
        Thread.sleep(1000);  // Short wait to ensure the Multiple Choice question is added
    }

    // Test case 12: Assign Stratified questions for the homework
    @Test(priority = 13)
    public void Stratified() throws InterruptedException {
        // Clicking on the Stratified option to assign Stratified questions for homework
        assignmentsPage.clickStratified();
        Thread.sleep(10000);  // Wait to ensure the Stratified questions load correctly
    }

    // Test case 13: Enable Adaptive learning for the assignment
    @Test(priority = 14)
    public void Adaptive() throws InterruptedException {
        // Clicking on the Adaptive option to enable Adaptive learning for the assignment
        assignmentsPage.clickAdaptive();
        Thread.sleep(10000);  // Wait to ensure the Adaptive learning settings are applied
    }

    // Test case 14: Click on Subjective option for the assignment
    @Test(priority = 15)
    public void clickonSubjective() throws InterruptedException {
        // Clicking on the Subjective option to select it for the assignment
        assignmentsPage.clickOnSubjective();
        Thread.sleep(1000);  // Short wait to ensure the Subjective option is selected
    }

    // Test case 15: Enter marks for the homework
    @Test(priority = 16)
    public void enterMarks() throws InterruptedException {
        // Enter marks (e.g., "85") into the Marksenter input field
        assignmentsPage.enterMarks("85");  // You can replace "85" with your desired test data
        Thread.sleep(1000);  // Short wait to ensure marks are entered correctly
    }

    // Test case 16: Click on the Ideal Answer option for the assignment
    @Test(priority = 17)
    public void idealAnswer() throws InterruptedException {
        // Clicking on the Ideal Answer option for the assignment
        assignmentsPage.clickIdealAnswer();
        Thread.sleep(1000);  // Short wait to ensure the Ideal Answer option is clicked
    }

    // Test case 17: Attach Rubrics to the homework
    @Test(priority = 18)
    public void AttachRubrics() throws InterruptedException {
        // Clicking on the Attach Rubrics option to add rubrics to the assignment
        assignmentsPage.clickAttachRubrics();
        Thread.sleep(1000);  // Short wait to ensure rubrics are attached
    }

    // Test case 18: Click on the Rubrics link
    @Test(priority = 19)
    public void ClickRubricslink() throws InterruptedException {
        // Clicking on the Rubrics link to open the rubrics section
        assignmentsPage.ClickRubricslink();
        Thread.sleep(100);  // Short wait to ensure the Rubrics link is clicked
    }

    // Test case 19: Click on New Rubric Template to create a new rubric
//    @Test(priority = 20)
//    public void cliknewRubricTemplate() throws InterruptedException {
//        // Clicking on the option to create a new Rubric template
//        assignmentsPage.cliknewRubricTemplate();
//        Thread.sleep(100);  // Short wait to ensure the Rubric template is selected
//    }
//
//    // Test case 20: Click on the Rubric back button to return to the previous page
//    @Test(priority = 21)
//    public void ClickonRubricbackbutton() throws InterruptedException {
//        // Clicking on the back button in the Rubric section to navigate back
//        assignmentsPage.ClickonRubricbackbutton();
//        Thread.sleep(100);  // Short wait to ensure the back navigation is complete
//    }

    // Clean up after the tests: Close the browser and flush ExtentReports
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        ExtentManager.flushReports();  // Flush Extent Reports to save results
    }
}
