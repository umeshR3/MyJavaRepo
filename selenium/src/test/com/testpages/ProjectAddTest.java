package com.testpages;

import com.pages.CustomerProjectPage;
import com.pages.ProjectAdd;
import com.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utillPackage.Utillclass;

public class ProjectAddTest extends BaseTest {
    HomePage homepage;
    ProjectAdd projectAdd;
    CustomerProjectPage customerProjectPage;
    @BeforeClass
    public void lunchdriver()
    {
       /* System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       // login=new LoginPage(driver);*/
        //homepage=new HomePage(driver);
        homepage= PageFactory.initElements(driver,HomePage.class);
        customerProjectPage=new CustomerProjectPage(driver);
        projectAdd=new ProjectAdd(driver);

    }
    @Test()
    public void navigateToProjectsAndCustomers()
    {

        String expectedProjectAndCustomerTitle="actiTIME - Active Projects & Customers";
        homepage.ProjectsAndCustomers();
        //homepage.CompletedTasks();
       /* String title=utillclass.getTitle();
        System.out.println("Title of the page" +title);
        Assert.assertEquals(expectedProjectAndCustomerTitle,title);
*/
    }
    @Test(dependsOnMethods = "navigateToProjectsAndCustomers")
    public void addNewcustomerAddNewProject() throws InterruptedException {
        projectAdd.customeraddAndAddProject();
        String expectedText="Project has been successfully registered.";
        String actualText= customerProjectPage.getText();
        Assert.assertEquals(expectedText,actualText);
        System.out.println(actualText);

    }
    @Test(dependsOnMethods = "navigateToProjectsAndCustomers")
    public void addProjectTest()
    {
        projectAdd.addProject();
        String expectedText="Project has been successfully registered.";
        String actualText= customerProjectPage.getText();
        Assert.assertEquals(expectedText,actualText);
        System.out.println(actualText);
    }
    @Test(dependsOnMethods = "navigateToProjectsAndCustomers")
    public void addProjectAddTaskToPoject()
    {
        projectAdd.addProjectAddTask();
        String expectedText="Project has been successfully registered.";
        String actualText= customerProjectPage.getText();
        Assert.assertEquals(expectedText,actualText);
        System.out.println(actualText);
    }
    @Test(dependsOnMethods = "navigateToProjectsAndCustomers")
    public void addMorePoject()
    {
        projectAdd.addMoreProject();
        String expectedText="Project has been successfully registered.";
        String actualText= customerProjectPage.getText();
        Assert.assertEquals(expectedText,actualText);
        System.out.println(actualText);
    }




   /* @AfterClass
    public void driverQuite()
    {
        driver.quit();
    }*/
}
