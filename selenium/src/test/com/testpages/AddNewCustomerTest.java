package com.testpages;

import com.pages.ProjectAdd;
import com.pages.CustomerProjectPage;
import com.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utillPackage.Utillclass;

public class AddNewCustomerTest extends BaseTest {
   // LoginPage loginTest;
   HomePage homepage;
    Utillclass utillclass;
    CustomerProjectPage customerProjectPage;
    ProjectAdd projectAdd;
    @BeforeClass
    public void lunchdriver()
    {
       /* System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       // login=new LoginPage(driver);*/
        //homepage=new HomePage(driver);
        homepage= PageFactory.initElements(driver,HomePage.class);


        utillclass=new Utillclass(driver);

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
    //LoginPage login;
    @Test(dependsOnMethods = "navigateToProjectsAndCustomers")
    public void addNewcustomer()
    {
        customerProjectPage=new CustomerProjectPage(driver);
        String expectedText="Customer has been successfully registered.";
       String actualText= customerProjectPage.customeradd().getText();
       Assert.assertEquals(expectedText,actualText);
        System.out.println(actualText);

    }
    @Test(dependsOnMethods = "navigateToProjectsAndCustomers")
    public void addNewcustomerAddNewProject() throws InterruptedException {
        projectAdd=new ProjectAdd(driver);
        projectAdd.customeraddAndAddProject();
       /* String expectedText="Customer has been successfully registered.";
        String actualText= customerProjectPage.customeradd().getText();
        Assert.assertEquals(expectedText,actualText);
        System.out.println(actualText);*/

    }
    @Test(dependsOnMethods = "addNewcustomer")
    public void searchTask()
    {
        homepage.openTask();
        homepage.clickOnSerachTask();
    }
    @AfterClass(enabled = true)
    public void quit()
    {
        driver.quit();
    }
}
